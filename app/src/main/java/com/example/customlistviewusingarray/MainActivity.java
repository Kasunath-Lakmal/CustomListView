package com.example.customlistviewusingarray;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //1.image ang other things set the array
    String mTitle[] = {"Facebook","Twitter","What's app","Instagram","Youtube"};
    String mDescription[] = {"Facebook Description","Twitter Description","What's app Description","Instagram Description","Youtube Description"};
    int images[] = {R.drawable.facebook, R.drawable.twitter, R.drawable.whatsapp, R.drawable.instagram, R.drawable.youtube};

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
     //2.create an adapter class
        Myadapter adapter = new Myadapter(this, mTitle, mDescription, images );
        listView.setAdapter(adapter);

    //4. set item click on list view
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            if (position == 0)
            {
//                Toast.makeText(MainActivity.this,"Facebook Description", Toast.LENGTH_SHORT).show();
                //5. pass the data another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //this intent put our 0 index image to another activity
                Bundle bundle = new Bundle();
                bundle.putInt("image", images [0]);
                intent.putExtras(bundle);
                //now put title and description to another activity
                intent.putExtra("title", mTitle[0]);
                intent.putExtra("description", mDescription[0]);
                //also put your position
                intent.putExtra("position", ""+0);
                startActivity(intent);
            }

            if (position == 1)
            {
                //5. pass the data another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //this intent put our 0 index image to another activity
                Bundle bundle = new Bundle();
                bundle.putInt("image", images [1]);
                intent.putExtras(bundle);
                //now put title and description to another activity
                intent.putExtra("title", mTitle[1]);
                intent.putExtra("description", mDescription[1]);
                //also put your position
                intent.putExtra("position", ""+1);
                startActivity(intent);
            }

            if (position == 2)
            {
                //5. pass the data another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //this intent put our 0 index image to another activity
                Bundle bundle = new Bundle();
                bundle.putInt("image", images [2]);
                intent.putExtras(bundle);
                //now put title and description to another activity
                intent.putExtra("title", mTitle[2]);
                intent.putExtra("description", mDescription[2]);
                //also put your position
                intent.putExtra("position", ""+2);
                startActivity(intent);
            }

            if (position == 3)
            {
                //5. pass the data another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //this intent put our 0 index image to another activity
                Bundle bundle = new Bundle();
                bundle.putInt("image", images [3]);
                intent.putExtras(bundle);
                //now put title and description to another activity
                intent.putExtra("title", mTitle[3]);
                intent.putExtra("description", mDescription[3]);
                //also put your position
                intent.putExtra("position", ""+3);
                startActivity(intent);
            }

            if (position == 4)
            {
                //5. pass the data another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //this intent put our 0 index image to another activity
                Bundle bundle = new Bundle();
                bundle.putInt("image", images [4]);
                intent.putExtras(bundle);
                //now put title and description to another activity
                intent.putExtra("title", mTitle[4]);
                intent.putExtra("description", mDescription[4]);
                //also put your position
                intent.putExtra("position", ""+4);
                startActivity(intent);
            }
        }
    });

        }

    //2.create an adapter class
        class Myadapter extends ArrayAdapter<String> {

          Context context;
          String rTitle[];
          String rDescription[];
          int rImgs[];
          Myadapter (Context c, String title[], String description[], int imgs[]){
              super(c, R.layout.row, R.id.TextView1, title);
              this.context =c;
              this.rDescription = description;
              this.rTitle = title;
              this.rImgs = imgs;
          }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
                View row =layoutInflater.inflate(R.layout.row, parent, false);
                ImageView images = row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.TextView1);
                TextView myDescription = row.findViewById(R.id.TextView2);
     //3.set the resource on views
                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);



                return row;
            }
        }


}