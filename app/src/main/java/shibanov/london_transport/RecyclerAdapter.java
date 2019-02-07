package shibanov.london_transport;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>{

    private static Context mContext;

    public RecyclerAdapter(Context context){
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        return new RecyclerHolder(inflater.inflate(R.layout.item_recycler_main,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder recyclerHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 26;
    }


    static class RecyclerHolder extends RecyclerView.ViewHolder{

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext,DetailedActivity.class);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
