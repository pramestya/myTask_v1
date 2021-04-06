package com.example.mytask_v1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private ArrayList<Task> ListTugas;

    public TaskAdapter(ArrayList<Task> listTugas) {
        this.ListTugas = listTugas;
    }

    @NonNull
    @Override
    public TaskAdapter.TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_task, parent, false);

        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.TaskViewHolder holder, int position) {
            holder.tv_Matkul.setText(ListTugas.get(position).getMatkul());
            holder.tv_Tugas.setText(ListTugas.get(position).getTugas());
            holder.tv_Deadline.setText(ListTugas.get(position).getDeadline());
    }

    @Override
    public int getItemCount() {
        return (ListTugas != null) ? ListTugas.size() : 0;
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_Matkul, tv_Tugas, tv_Deadline;
        private CardView contenrCard;

        public TaskViewHolder (View view){
            super(view);

            tv_Matkul =view.findViewById(R.id.tv_Matkul);
            tv_Tugas = view.findViewById(R.id.tv_Tugas);
            tv_Deadline = view.findViewById(R.id.tv_Deadline);
//            contentrCard = view.findViewById(R.id.contentCard);

        }
    }
}
