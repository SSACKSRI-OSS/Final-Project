package com.professionalandroid.apps.ssack_3re;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    List<String> items ;
    SearchView searchView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        items = new ArrayList<>();
        items.add("닭뼈 : 일반쓰레기");
        items.add(" ");
        items.add("바나나 껍질: 음식물 쓰레기");
        items.add(" ");
        items.add("사과 껍질: 음식물 쓰레기");
        items.add(" ");
        items.add("배 껍질: 음식물 쓰레기");
        items.add(" ");
        items.add("돼지뼈 : 일반쓰레기");
        items.add(" ");
        items.add("소뼈 : 일반쓰레기");
        items.add(" ");
        items.add("귤 껍질: 음식물쓰레기");
        items.add(" ");
        items.add("채소 뿌리 : 일반쓰레기");
        items.add(" ");
        items.add("채소 줄기 : 일반쓰레기");
        items.add(" ");
        items.add("채소 껍질 : 일반쓰레기");
        items.add(" ");
        items.add("채소 단단한 씨앗 : 일반쓰레기");
        items.add(" ");
        items.add("쪽파 : 일반쓰레기");
        items.add(" ");
        items.add("미나리 : 일반쓰레기");
        items.add(" ");
        items.add("대파 : 일반쓰레기");
        items.add(" ");
        items.add("뿌리 채소 : 일반쓰레기");
        items.add(" ");
        items.add("마늘 : 일반쓰레기");
        items.add(" ");
        items.add("옥수수 알갱이 : 음식물쓰레기");
        items.add(" ");
        items.add("옥수수대 : 일반쓰레기");
        items.add(" ");
        items.add("옥수수 껍질 : 일반쓰레기");
        items.add(" ");
        items.add("양파 : 일반쓰레기");
        items.add(" ");
        items.add("코코넛 껍질 : 일반쓰레기");
        items.add(" ");
        items.add("코코넛 씨앗 : 일반쓰레기");
        items.add(" ");
        items.add("파인애플 껍질 : 일반쓰레기");
        items.add(" ");
        items.add("파인애플 씨앗 : 일반쓰레기");
        items.add(" ");
        items.add("수박 (부피가 큰) 껍질: 일반쓰레기");
        items.add(" ");
        items.add("수박 (잘게 썬) 껍질: 음식물 쓰레기");
        items.add(" ");
        items.add("호두 껍질 : 일반쓰레기");
        items.add(" ");
        items.add("땅콩 껍질: 일반쓰레기");
        items.add(" ");
        items.add("밤: 일반쓰레기");
        items.add(" ");
        items.add("보리 (단단한) 껍질: 일반쓰레기");
        items.add(" ");
        items.add("쌀  단단한) 껍질: 일반쓰레기");
        items.add(" ");
        items.add("콩 (단단한) 껍질: 일반쓰레기");
        items.add(" ");
        items.add("페트병: 1. 내용물 비우고 물로 이물질 제거");
        items.add(" ");
        items.add("페트병: 2. 부착상표,부속품 등 본체와 다른 재질 제거");
        items.add(" ");
        items.add("PET: 1. 내용물 비우고 물로 이물질 제거");
        items.add(" ");
        items.add("PET: 2. 내용물 비우고 물로 이물질 제거");
        items.add(" ");
        items.add("플라스틱 : 1. 내용물 비우고 이물질 제거");
        items.add(" ");
        items.add("플라스틱 : 2. 부착상표,부속품 등 본체와 다른 재질 제거 ");
        items.add(" ");
        items.add("Plastic : 1. 내용물 비우고 이물질 제거");
        items.add(" ");
        items.add("Plastic : 2. 부착상표,부속품 등 본체와 다른 재질 제거 ");
        items.add(" ");






        searchView = findViewById(R.id.searchView);
        textView = findViewById(R.id.textView);
        textView.setText(getResult());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, Search_result.class);
                startActivity(intent);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                textView.setText(search(newText));
                return true;
            }
        });
    }

    private String search(String query){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++){
            String item  = items.get(i);
            if (item.toLowerCase().contains(query.toLowerCase())){
                sb.append(item);
                if (i != items.size() - 1){
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
    private String getResult(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++){
            String item = items.get(i);
            sb.append(item);
            if (i != items.size() - 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}