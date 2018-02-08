package camp.bso.inf.scoringboard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedList;
public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordListHome;
    private final LinkedList<String> mWordListAway;

    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String>wordList1, LinkedList<String>wordList2) {
        mInflater = LayoutInflater.from(context);
        this.mWordListHome = wordList1;
        this.mWordListAway = wordList2;
    }
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_item_team, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent1 = mWordListHome.get(position);
        String mCurrent2 = mWordListAway.get(position);
        holder.wordItemView1.setText(mCurrent1);
        holder.wordItemView2.setText(mCurrent2);
    }
    @Override
    public int getItemCount() {
        return mWordListHome.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView wordItemView1;
        public final TextView wordItemView2;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView1 = (TextView) itemView.findViewById(R.id.team1);
            wordItemView2 = (TextView) itemView.findViewById(R.id.team2);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

         //   int mPosition = getLayoutPosition();

           // String element = mWordListHome.get(mPosition);

           // mWordList.set(mPosition, "Clicked!	" + element);

           // mAdapter.notifyDataSetChanged();
        }
    }
}