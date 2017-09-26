package taskmanagement.vinod.com.payukickstarter;

import android.content.Intent;
import android.icu.util.Currency;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class ProjectDetailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Project Detail");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            Project project = (Project) intent.getSerializableExtra(ServiceConstant.KEY_PROJECT);
            TextView projectTitle = (TextView) findViewById(R.id.tv_project_title),
                    projectCreator = (TextView) findViewById(R.id.tv_project_by), projectAmount = (TextView) findViewById(R.id.tv_amount),
                    projectBlurb = (TextView) findViewById(R.id.tv_blurb), projectCountry = (TextView) findViewById(R.id.tv_country),
                    projectEndDate = (TextView) findViewById(R.id.tv_end_date), projectLocation = (TextView) findViewById(R.id.tv_location),
                    projectBankers = (TextView) findViewById(R.id.tv_bankers);
            projectTitle.setText(project.getTitle());
            projectAmount.setText(Html.fromHtml("&#x2713;  " + project.getAmountPledged()));
            projectCreator.setText(Html.fromHtml("&#x2713;  Project by :   " +project.getBy()));
            projectBlurb.setText(Html.fromHtml("&#x2713;   " +project.getBlurb()));
            projectCountry.setText(Html.fromHtml("&#x2713;   " +project.getCountry()));
            projectEndDate.setText(Html.fromHtml("&#x2713;   " +project.getEndTime()));
            projectLocation.setText(Html.fromHtml("&#x2713;   " +project.getLocation()));
            projectBankers.setText(Html.fromHtml("&#x2713;   " +project.getNumberBackers()));

        } else {
            finish();
        }


    }

}
