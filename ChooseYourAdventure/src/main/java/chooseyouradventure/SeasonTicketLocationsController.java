// Craig Longnecker
package chooseyouradventure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeasonTicketLocationsController {
	public static final String[] states = { "IA", "AL", "AK", "AR", "CA", "CO", "CT", "DE", "FL", "GA",
			"HI", "ID", "IL", "IN", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MO", "MT", "NE",
			"NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN",
			"TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" };
	
	public static final String[] sections = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
			"41", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ZZ" };
	
	public static final String[] rows = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" };
	
	@Autowired
	SeasonTicketLocationsDao dao;
	
	@RequestMapping(value = "/form")
	public ModelAndView seasonTicketLocations() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("seasonTicketLocationsForm");
		modelAndView.addObject("seasonTicketLocations", new SeasonTicketLocations());
		modelAndView.addObject("states", states);
		modelAndView.addObject("sections", sections);
		modelAndView.addObject("rows", rows);
		
		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processSeasonTicketLocations(SeasonTicketLocations seasonTicketLocations) {
		System.out.println("In processSeasonTicketLocations");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertSeasonTicketLocations(seasonTicketLocations);
//		System.out.println("Value in getLastName" + seasonTicketLocations.getLastName());
		modelAndView.setViewName("seasonTicketLocationsResult");
		modelAndView.addObject("s", seasonTicketLocations);
		return modelAndView;
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<SeasonTicketLocations> allSeasonTicketLocations = dao.getAllSeasonTicketLocations();
		modelAndView.setViewName("viewAllSeasonTicketLocations");
		modelAndView.addObject("all", allSeasonTicketLocations);
		return modelAndView;
	}

	@Bean
	public SeasonTicketLocationsDao dao() {
		SeasonTicketLocationsDao bean = new SeasonTicketLocationsDao();
		return bean;
	}
}
