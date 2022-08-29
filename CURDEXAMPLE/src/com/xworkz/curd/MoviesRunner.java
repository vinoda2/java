package com.xworkz.curd;

import com.xworkz.curd.dao.MoviesDAO;
import com.xworkz.curd.dao.MoviesDaoImp;
import com.xworkz.curd.dto.MoviesDTO;

public class MoviesRunner {
	
	public static void main(String[] args) {
		
		MoviesDTO dto = new MoviesDTO("kannada", "comedy", 200,6);
		MoviesDAO mdto = new MoviesDaoImp();
		mdto.saveDTO(dto);
		
		MoviesDTO dto1 = new MoviesDTO("tamil", "comedy", 200,6);
		dto1.setLanguage("English");
		dto1.setMovieType("friction");
		dto1.setRatings(5);
		mdto.saveDTO(dto1);
		
		MoviesDTO dto2 = new MoviesDTO("Telugu", "comedy", 200,6);
		mdto.saveDTO(dto2);
		MoviesDTO dto3 = new MoviesDTO("hindi", "comedy", 200,6);
		mdto.saveDTO(dto3);
		MoviesDTO dto4 = new MoviesDTO("Franch", "comedy", 200,6);
		mdto.saveDTO(dto4);
		mdto.readDTO();
		
		mdto.deleteDTO(dto4);
		mdto.readDTO();
		
		
	}
	

}
