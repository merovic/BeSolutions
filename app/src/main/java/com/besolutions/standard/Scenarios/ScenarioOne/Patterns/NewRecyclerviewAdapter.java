package com.besolutions.standard.Scenarios.ScenarioOne.Patterns;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.besolutions.standard.R;
import com.besolutions.standard.Scenarios.ScenarioOne.Models.NewRecyclerviewView;

import java.util.List;

public class NewRecyclerviewAdapter extends RecyclerView.Adapter<NewRecyclerviewAdapter.NewRecyclerviewViewHolder> {

    private final Context context;
    private List<NewRecyclerviewView> items;

    public NewRecyclerviewAdapter(List<NewRecyclerviewView> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public NewRecyclerviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_newrecyclerview, parent, false);
        return new NewRecyclerviewViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewRecyclerviewViewHolder holder, int position) {
        NewRecyclerviewView item = items.get(position);
        //TODO Fill in your logic for binding the view.
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    class NewRecyclerviewViewHolder extends RecyclerView.ViewHolder {

        NewRecyclerviewViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

}



// To Generate Adapters


/*
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

        import android.content.Context;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import java.util.List;

        #parse("File Header.java")
public class ${NAME} extends RecyclerView.Adapter<${NAME}.${VIEWHOLDER_CLASS}> {

private final Context context;
private List<${ITEM_CLASS}> items;

public ${NAME}(List<${ITEM_CLASS}> items, Context context) {
        this.items = items;
        this.context = context;
        }

@Override
public ${VIEWHOLDER_CLASS} onCreateViewHolder(ViewGroup parent,int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.${LAYOUT_RES_ID}, parent, false);
        return new ${VIEWHOLDER_CLASS}(v);
        }

@Override
public void onBindViewHolder(${VIEWHOLDER_CLASS} holder, int position) {
        ${ITEM_CLASS} item = items.get(position);
        //TODO Fill in your logic for binding the view.
        }

@Override
public int getItemCount() {
        if (items == null){
        return 0;
        }
        return items.size();
        }

class ${VIEWHOLDER_CLASS} extends RecyclerView.ViewHolder {

        ${VIEWHOLDER_CLASS}(@NonNull View itemView) {
        super(itemView);

        }
        }

        }*/
