package taskmanagement.vinod.com.payukickstarter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Vinod on 8/12/2017.
 */

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.MyViewHolder> {

    private List<Project> projectList;
    private Activity activity;

    public ListViewAdapter(List<Project> taskItemList, Activity activity) {
        this.projectList = taskItemList;
        this.activity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_single_item, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Project project = projectList.get(position);
        holder.projectName.setText(project.getTitle());
        holder.projectBy.setText("By: " + project.getBy());
        holder.pleadge.setText("Pleadge: " +project.getAmountPledged());
        holder.backers.setText("Backer: " +project.getNumberBackers());
        holder.enddate.setText("No. of Days to go: " + project.getEndTime());
        holder.projectItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,ProjectDetailScreen.class);
                intent.putExtra(ServiceConstant.KEY_PROJECT, project);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView projectName;
        TextView projectBy;
        TextView pleadge;
        TextView backers;
        TextView enddate;
        LinearLayout projectItemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            projectName = itemView.findViewById(R.id.tv_project_title);
            projectBy = itemView.findViewById(R.id.tv_project_by);
            pleadge = itemView.findViewById(R.id.tv_pleadge);
            backers = itemView.findViewById(R.id.tv_backers);
            enddate = itemView.findViewById(R.id.tv_end_date);
            projectItemView = itemView.findViewById(R.id.project_item);
        }
    }
}


