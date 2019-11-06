package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Recruit;

public interface RecruitDao {

	@Select("select * from e_recruit where (c_num = #{cNum} and CLASS_NUM = #{classNum}) and (recruit_e_date IS NULL and u_id2 is null)")
	List<Recruit> queryAllBycNum(Recruit recruit);
	
	@Select("select * from e_recruit where  U_ID = #{uId}")
	List<Recruit> queryRecruitHistory(Integer uId);
	
	@Select("select u_id2,u_id,c_num,class_num,recruit_text,recruit_s_time,recruit_e_date,recruit_num from e_recruit where  U_ID = #{uId} and recruit_e_date is not null group by u_id2")
	List<Recruit> queryRecruitByuId(Integer uId);
	
	@Select("select u_id2,u_id,c_num,class_num,recruit_text,recruit_s_time,recruit_e_date,recruit_num from e_recruit where  u_id2 is not null and U_ID = #{uId} and recruit_e_date is not null group by u_id2")
	List<Recruit> queryRecruitByuIdAndNotNull(Integer uId);
	
	@Select("select recruit_text from e_recruit where recruit_num = #{recruitNum}")
	String queryRecruitTextByRecruitNum(Integer recruitNum);
	
	@Select("select * from e_recruit where recruit_num = #{recruitNum}")
	Recruit queryAllByRecruitNum(Integer recruitNum);
	
	@Select("select * from e_recruit where  U_ID2 = #{uId2}")
	List<Recruit> queryRecruitByUid2(Integer uId);
}
