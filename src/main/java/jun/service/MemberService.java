package jun.service;

import java.util.HashMap;
import java.util.List;

import egovframework.com.cmm.LoginVO;
import jun.dao.MemberDAO;
import jun.vo.MemberBean;

public interface MemberService {

	void selectUserInfo(HashMap<String, String> map);

	MemberBean userCheck(MemberBean mb);

	void insert(MemberBean mb);

	MemberBean actionLogin(MemberBean mb) throws Exception;

	

}
