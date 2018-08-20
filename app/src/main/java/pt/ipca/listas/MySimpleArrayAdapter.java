package pt.ipca.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
  Created by Nuno on 07/05/2018.
 */

public class MySimpleArrayAdapter extends ArrayAdapter {

    public Context mContext;
    public List<Car> mCars;

    public MySimpleArrayAdapter (Context context, List<Car> car) {
        super(context,R.layout.list_view_row,car);
        this.mContext = context;
        this.mCars = car;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_view_row,parent, false);
        }

        Car car = mCars.get(position);

        TextView label = convertView.findViewById(R.id.marca_nome);
        ImageView iv = convertView.findViewById(R.id.marca);

        label.setText(car.mBrand);
        iv.setImageResource(car.mLogo);

        return convertView;
    }

}
