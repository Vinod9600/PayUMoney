package taskmanagement.vinod.com.payukickstarter;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Vinod on 8/12/2017.
 */

public class HttpRequestHandler {

    private Activity activity;
    private String url = "http://starlord.hackerearth.com/kickstarter";

    public HttpRequestHandler(Activity activity) {
        this.activity = activity;
    }

    public void makeRequest() {
        new HttpGetData().execute(url);
    }

    private class HttpGetData extends AsyncTask<String, Void, String> {
        public static final String REQUEST_METHOD = "GET";
        public static final int READ_TIMEOUT = 15000;
        public static final int CONNECTION_TIMEOUT = 15000;

        @Override
        protected String doInBackground(String... params) {
            String stringUrl = params[0];
            String result = null;
            String inputLine;

            try {
                //Create a URL object holding our url
                URL myUrl = new URL(stringUrl);

                //Create a connection
                HttpURLConnection connection = (HttpURLConnection)
                        myUrl.openConnection();

                //Set methods and timeouts
                connection.setRequestMethod(REQUEST_METHOD);
                connection.setReadTimeout(READ_TIMEOUT);
                connection.setConnectTimeout(CONNECTION_TIMEOUT);

                //Connect to our url
                connection.connect();

                //Create a new InputStreamReader
                InputStreamReader streamReader = new
                        InputStreamReader(connection.getInputStream());

                //Create a new buffered reader and String Builder
                BufferedReader reader = new BufferedReader(streamReader);
                StringBuilder stringBuilder = new StringBuilder();

                //Check if the line we are reading is not null
                while ((inputLine = reader.readLine()) != null) {
                    stringBuilder.append(inputLine);
                }

                //Close our InputStream and Buffered reader
                reader.close();
                streamReader.close();

                //Set our result equal to our stringBuilder
                result = stringBuilder.toString();
            } catch (IOException e) {
                e.printStackTrace();
                result = null;
            }

            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            try {
                ProjectList projectList = new ProjectList(s);
                ApplicationLayer.mDataCache.put(ServiceConstant.KEY_PROJECT_LIST, projectList);
                HttpRequestComplete httpRequestComplete = (HttpRequestComplete) activity;
                httpRequestComplete.onHttpRequestComplete();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public interface HttpRequestComplete {
        void onHttpRequestComplete();
    }
}