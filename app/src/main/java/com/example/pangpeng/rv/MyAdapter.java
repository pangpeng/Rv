package com.example.pangpeng.rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by pangpeng on 2016/4/17.
 */
class MyAdapter extends RecyclerView.Adapter {

    //自建textView 与 ViewHolder关联
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle,tvContent;
        public ViewHolder(View root) {
            super(root);
            tvTitle = (TextView) root.findViewById(R.id.textTitle);
            tvContent = (TextView) root.findViewById(R.id.textContent);
        }
        public TextView getTvContent() {
            return tvContent;
        }
        public TextView getTvTitle() {
            return tvTitle;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //return null;
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
//        vh.getTv().setText("item"+position);
//        vh.getTv().setText(data[position]);
        CellData cd = cellData[position];
        vh.getTvTitle().setText(cd.getTitle());
        vh.getTvContent().setText(cd.getContent());
    }

    //子对象数量10
    @Override
    public int getItemCount() {
//        return 100;
//        return data.length;
        return cellData.length;
    }

    private CellData[] cellData = new CellData[]{
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("水果","苹果"),
            new CellData("生物","男人"),
            new CellData("动物","女人")};
//    private String[] data = new String[]{"1", "2", "3:", "4", "5"};
}
