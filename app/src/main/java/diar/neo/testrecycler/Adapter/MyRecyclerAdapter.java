package diar.neo.testrecycler.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import diar.neo.testrecycler.Adapter.MyRecyclerAdapter.MyViewHolder;
import diar.neo.testrecycler.Model.User;
import diar.neo.testrecycler.R;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context mContext;
    private List<User> mUsers;


    public MyRecyclerAdapter(Context context, List<User> users) {

        mUsers = users;
        mContext = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_list_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txName.setText(mUsers.get(position).getName() + "   " + mUsers.get(position).getFamilyName());
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txName;


        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txName = itemView.findViewById(R.id.name);


        }
    }
}
