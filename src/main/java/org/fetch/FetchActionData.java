package org.fetch;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FetchActionData extends ActionSupport {
    List<FetchDataBean> dataList = null;
    ResultSet rs = null;
    String fetchData = null;
    FetchData daoObj = null;
    // Generate Getters and Setters...

    public String execute() throws Exception {
        try {
            if (fetchData.equals("FetchRecords")) {
                dataList = new ArrayList<FetchDataBean>();
                FetchDataBean dataBean = null;
                rs = new FetchData().fetchData();
                if (rs != null) {
                    while (rs.next()) {
                        dataBean = new FetchDataBean();
                        dataBean.setFname(rs.getString("FNAME"));
                        dataBean.setLname(rs.getString("LNAME"));
                        dataBean.setEmail(rs.getString("EMAIL"));
                        dataBean.setPassword(rs.getString("PASSWORD"));

                        dataList.add(dataBean);

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }
}
