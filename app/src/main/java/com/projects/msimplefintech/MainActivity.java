package com.projects.msimplefintech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Call<List<Model>> call;
    private TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = findViewById(R.id.Account);
        EndPoint service = new RetroInstance().getInstance().create(EndPoint.class);
        call = service.getData("3111513324", 011);
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                if (response.isSuccessful()) {
                    System.out.print("ERROR of SUCCCEEEDD");
                    StringBuilder build = new StringBuilder();
                    build.append(response.body().toString());
                    tx.setText(build);
                } else {
                    StringBuilder build = new StringBuilder();
                    build.append(response.errorBody());
                    tx.setText(build);
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                System.out.print(t.getMessage().toString());
                System.out.print("ERROR OF FAILER");
            }
        });


    }

}