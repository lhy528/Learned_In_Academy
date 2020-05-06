package main;

import java.util.ArrayList;

import dao.ProductDAO;
import vo.ProductVO;

public class ProductMain {
	public static void main(String[] args) {
		//new ProductDAO();
		
		ProductDAO dao = new ProductDAO();
//		//전체 데이터 조회
//		ArrayList<ProductVO> list = dao.getAllData();
//		for(ProductVO vo:list) {
//			System.out.println(vo.getImgfile());
//		}
		
		//상품번호로 개별 조회
//		ProductVO vo = dao.getData(1);
//		System.out.println(vo.getPno()+ "  ,  " + vo.getImgfile());
		
		//상품이름으로 개별 조회
//		ProductVO vo2 = dao.getDataByName("YSL");
//		System.out.println(vo2.getPno()+ "  ,  " + vo2.getPname()+ " , "+ vo.getImgfile());
		
		
		//업데이트 하기
		ProductVO vo = new ProductVO();
		vo.setPno(12);
		vo.setPrice(1800000);
		vo.setQty(5);
		vo.setDcratio(5);
		
//		dao.modifyData(vo);
		//지우기
		//dao.deleteData(11);
	}
}
