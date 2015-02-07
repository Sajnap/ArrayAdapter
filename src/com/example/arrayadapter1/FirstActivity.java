package com.example.arrayadapter1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class FirstActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstt);
		ListView mylistvView=(ListView)findViewById(R.id.listView1);

		UserAdapter myUserAdapter=new UserAdapter(getApplicationContext(),createDummyUserModels());
		mylistvView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){
		String[] names={"sreeroopa","sajna","praveen","kiran","anoop","vipin","anoop","thoufi","rihan","afu"};
		String[] email = {"senthiljs.1992@gmail.com","anandab@gmail.com","praveen1@gmail.com","kiran@gmail.com","anoop@imrokraft.com","vipinkarma@gmail.com","anoop@imrokraft.com","thoufeekkj@gmail.com","rihan@gmail.com","afu@gmail.com"};
		UserModel[] userlist=new UserModel[names.length];
		for(int i=0;i<email.length;i++){
			userlist[i]=new UserModel(names[i],email[i]);
		}
		return userlist;
	}



}
