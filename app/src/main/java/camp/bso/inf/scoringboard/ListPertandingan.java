package camp.bso.inf.scoringboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;
public class ListPertandingan extends AppCompatActivity {

    private final LinkedList<String> mWordList1 = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();
    private int mCount = 0;
    String home[] = {"Persib", "Persib", "Persib", "Persib"};
    String away[] = {"Persija", "Sriwijaya", "PSMS", "PSM"};

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        for(int i=0; i<4; i++) {
            mWordList1.addLast(home[i]);
            mWordList2.addLast(away[i]);
            Log.d("Wordlist", mWordList1.getLast());
            Log.d("Wordlist", mWordList2.getLast());
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mAdapter = new WordListAdapter(this, mWordList1, mWordList2);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}