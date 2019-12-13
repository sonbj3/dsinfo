package jun.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import jun.vo.MemberBean;

@Repository("memberDAO")
public class MemberDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<MemberBean> selectUserInfo(HashMap<String, String> map) {
		
		List<MemberBean> list = new ArrayList<>();
		list = (List<MemberBean>) list("jun.selectUserInfo", map);
		return list;
		
	}  
	
	public MemberBean userCheck(MemberBean mb) {
		System.out.println("usercheck dao");
		MemberBean result = null;
		try {
			result = (MemberBean) select("jun.userCheck", mb);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		return result;  
	}

	public void insert(MemberBean mb) {
		 
	}

	public MemberBean actionLogin(MemberBean mb) throws Exception {
		System.out.println("dao");
		return (MemberBean) select("memberDAO.actionLogin", mb);
	}
	
}
