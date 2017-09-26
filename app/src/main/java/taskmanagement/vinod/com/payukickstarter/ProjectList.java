package taskmanagement.vinod.com.payukickstarter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinod on 8/12/2017.
 */

public class ProjectList {

    private List<Project> projectList;

    ProjectList(String projectList) throws JSONException {
        if(projectList !=null && projectList.length()>0){
            JSONArray jsonArray = new JSONArray(projectList);
            setProjectList(jsonArray);
        }
    }


    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(JSONArray jsonArray) throws JSONException {
        projectList = new ArrayList<>();
        for(int i=0;i<jsonArray.length();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Project project = new Project(jsonObject);
            projectList.add(project);
        }
    }

}
