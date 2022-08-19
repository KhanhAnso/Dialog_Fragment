package com.example.mydialogfragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class UserInfoDialog extends DialogFragment {
    TextView tvName;
    TextView tvClass;
    TextView tvMSSV;
    Button btnUpdate;
    Button btnClose;
    EditText edtClassUpdate;
//    private OnInputMessageClass onInputMessageClass;
//
//    public void setOnInputMessageListener(OnInputMessageClass onInputMessageClass){
//        this.onInputMessageClass = onInputMessageClass;
//    }

    //Được dùng khi khởi tạo dialog mục đích nhận giá trị
    public static UserInfoDialog newInstance(String data) {
        UserInfoDialog dialog = new UserInfoDialog();
        Bundle args = new Bundle();
        args.putString("data", data);
        dialog.setArguments(args);
        return dialog;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.custom_user_info, container);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // lấy giá trị tự bundle
        String data = getArguments().getString("data", "");
        tvName = (TextView) view.findViewById(R.id.tv_name);
        tvMSSV = (TextView) view.findViewById(R.id.tv_mssv);
        tvClass = (TextView) view.findViewById(R.id.tv_class);
        btnClose = (Button) view.findViewById(R.id.btn_close);
        btnUpdate = (Button) view.findViewById(R.id.btn_update);
        edtClassUpdate = view.findViewById(R.id.edt_class);

        tvName.setText(data);
        tvClass.setText("Lớp : 10A3");
        tvMSSV.setText("Mã : 1234567890");

//        btnUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (onInputMessageClass != null){
//                    onInputMessageClass.onInputMessageClass(edtClassUpdate.getText().toString());
//                }
//                dismiss();
//            }
//        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

//    public interface OnInputMessageClass{
//        void onInputMessageClass(String message);
//    }
}
