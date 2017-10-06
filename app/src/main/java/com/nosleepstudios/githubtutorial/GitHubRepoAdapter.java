package com.nosleepstudios.githubtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class GitHubRepoAdapter extends RecyclerView.Adapter<GitHubRepoAdapter.ViewHolder> {

    private List<GitHubRepo> mRepoList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textRepoName, textRepoDesc;
        public View layout;
        public ViewHolder(View v) {

            super(v);
            layout = v;
            textRepoName = v.findViewById(R.id.text_repo_name);
            textRepoDesc = v.findViewById(R.id.text_repo_desc);
        }
    }

    public GitHubRepoAdapter(List<GitHubRepo> mRepoList) {
        this.mRepoList = mRepoList;
    }

    @Override
    public GitHubRepoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textRepoName.setText(mRepoList.get(position).getName());
        holder.textRepoDesc.setText(mRepoList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {

        return mRepoList.size();
    }
}