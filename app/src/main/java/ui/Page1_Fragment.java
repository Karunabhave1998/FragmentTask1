package ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fragmenttask1.R;


public class Page1_Fragment extends Fragment {

    ListView listView;
    String[] names={"Android Java","Android Kotlin","Android Compose","IOS","Web Front End","Web Back End"};
    ArrayAdapter<String> arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View root=inflater.inflate(R.layout.fragment_page1_, container, false);

        listView=root.findViewById(R.id.simple_List1);
        arrayAdapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);

        return root;
    }
}