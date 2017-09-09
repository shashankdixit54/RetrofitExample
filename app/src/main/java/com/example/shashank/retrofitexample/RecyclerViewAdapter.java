package com.example.shashank.retrofitexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shashank on 09-09-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    List<ItemModel> modelList;

    public RecyclerViewAdapter(List<ItemModel> modelList) {
        this.modelList = modelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.prodNameTv.setText(modelList.get(position).getName());
        holder.prodCategoryTv.setText("Category : "+modelList.get(position).getCategory());
        holder.prodSubCatTv.setText("Sub Category : "+modelList.get(position).getSubCategory());
        holder.mrpProdTv.setText("MRP : "+modelList.get(position).getMrp());
        holder.sellingPriceTv.setText("Selling Price : "+modelList.get(position).getSellingPrice());
        int pos = position+1;
        holder.productNumberTv.setText(pos+"");

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView prodNameTv, prodCategoryTv, prodSubCatTv, mrpProdTv, sellingPriceTv, productNumberTv;
        public MyViewHolder(View v) {
            super(v);
            prodNameTv = (TextView)v.findViewById(R.id.nameTv);
            prodCategoryTv = (TextView)v.findViewById(R.id.catTv);
            prodSubCatTv = (TextView)v.findViewById(R.id.subCatTv);
            mrpProdTv = (TextView)v.findViewById(R.id.mrpTv);
            sellingPriceTv = (TextView)v.findViewById(R.id.sellingPriceTv);
            productNumberTv = (TextView)v.findViewById(R.id.productNumber) ;

        }
    }
}
