
package com.cware.back.entity.table;

import com.cware.back.common.BaseEntity;

/**
* MD연결
*
* @version 1.0, 2006/07/13
* @author Commerceware Ins.
*/
public class Tmdlink extends BaseEntity {

    public Tmdlink(){ super();}

    private String md_code;
    private String user_id;
    private double rate;
    private String start_date;
    private String end_date;
    private String use_yn;
    private String main_yn;
    private String insert_date;
    private String insert_id;
    private String modify_date;
    private String modify_id;

    /** Set Method **/
    public void setMd_code( String md_code ){ this.md_code = md_code; }
    public void setUser_id( String user_id ){ this.user_id = user_id; }
    public void setRate( double rate ){ this.rate = rate; }
    public void setStart_date( String start_date ){ this.start_date = start_date; }
    public void setEnd_date( String end_date ){ this.end_date = end_date; }
    public void setInsert_date( String insert_date ){ this.insert_date = insert_date; }
    public void setInsert_id( String insert_id ){ this.insert_id = insert_id; }
    public void setModify_date( String modify_date ){ this.modify_date = modify_date; }
    public void setModify_id( String modify_id ){ this.modify_id = modify_id; }
    public void setUse_yn(String useYn) {
		use_yn = useYn;
	}
    public void setMain_yn(String mainYn) {
		main_yn = mainYn;
	}

    /** Get Method **/
    public String getMd_code(){ return md_code; }
    public String getUser_id(){ return user_id; }
    public double getRate(){ return rate; }
    public String getStart_date(){ return start_date; }
    public String getEnd_date(){ return end_date; }
    public String getInsert_date(){ return insert_date; }
    public String getInsert_id(){ return insert_id; }
    public String getModify_date(){ return modify_date; }
    public String getModify_id(){ return modify_id; }
	public String getUse_yn() {
		return use_yn;
	}
	
	public String getMain_yn() {
		return main_yn;
	}
}
