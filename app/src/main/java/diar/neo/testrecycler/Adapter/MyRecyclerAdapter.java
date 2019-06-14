package diar.neo.testrecycler.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import diar.neo.testrecycler.Adapter.MyRecyclerAdapter.MyViewHolder;
import diar.neo.testrecycler.Model.User;
import diar.neo.testrecycler.R;
import diar.neo.testrecycler.SecondActivity;

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
        holder.txtName.setText(mUsers.get(position).getName() + "   " + mUsers.get(position).getFamilyName());

        //holder.txtName.setOnClickListener(holder);
        holder.imgRemove.setOnClickListener(holder);
        holder.mCardView.setOnClickListener(holder);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements OnClickListener {
        private TextView txtName;
        private ImageView imgRemove;
        private CardView mCardView;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.name);
            imgRemove = itemView.findViewById(R.id.remove);
            mCardView = itemView.findViewById(R.id.cardViews);
        }

        private void sendData() {

            Intent intent = new Intent(mContext, SecondActivity.class);
            intent.putExtra(SecondActivity.KEY_NAME, txtName.getText());
            mContext.startActivity(intent);

        }


        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.cardViews:
                    sendData();
                    break;

                case R.id.remove:
                    removeItem(getAdapterPosition());
                    break;


            }
        }
    }

    public void addUser(List<User> users) {

        this.mUsers = users;
        notifyDataSetChanged();

    }

    private void removeItem(int position) {

        mUsers.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mUsers.size());


    }
}
