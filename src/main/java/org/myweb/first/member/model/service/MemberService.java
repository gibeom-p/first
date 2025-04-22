package org.myweb.first.member.model.service;

import java.util.ArrayList;

import org.myweb.first.common.Paging;
import org.myweb.first.common.Search;
import org.myweb.first.member.model.dto.Member;

//spring framework 에서 서비스 모델은 인터페이스로 만들도록 정해져있음
//인터페이스에서 비즈니스 로직 처리용 메소드 규칙을 정의함
public interface MemberService {
	/* public abstract */ Member selectLogin(Member member);
	
	int selectCheckId(String userId);
	Member selectMember(String userId);
	
	//dml ----------------------------------------------------------
	int insertMember(Member member);
	int updateMember(Member member);
	int deleteMember(String userId);
	//관리자용 -----------------------------------------------------
	int selectListCount();
	ArrayList<Member> selectList(Paging paging);
	int updateLoginOk(Member member);
	// 회원 검색 카운트용 ----------------------------------
	public int selectSearchUserIdCount(String keyword);
	public int selectSearchGenderCount(String keyword);
	public int selectSearchAgeCount(int age);
	public int selectSearchEnrollDateCount(Search search);
	public int selectSearchLoginOKCount(String keyword);
	// 관리자용 검색 목록 출력용 ----------------------------------
	public ArrayList<Member> selectSearchUserId(Search search);
	public ArrayList<Member> selectSearchGender(Search search);
	public ArrayList<Member> selectSearchAge(Search search);
	public ArrayList<Member> selectSearchEnrollDate(Search search);
	public ArrayList<Member> selectSearchLoginOK(Search search);
}
