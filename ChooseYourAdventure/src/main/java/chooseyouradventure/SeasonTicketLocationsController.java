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
	@Autowired
	SeasonTicketLocationsDao dao;

	@RequestMapping(value = "/form")
	public ModelAndView seasonTicketLocations() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("seasonTicketLocationsForm");
		modelAndView.addObject("seasonTicketLocations", new SeasonTicketLocations());

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processSeasonTicketLocations(SeasonTicketLocations seasonTicketLocations) {
		System.out.println("In processSeasonTicketLocations");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertSeasonTicketLocations(seasonTicketLocations);
		System.out.println("Value in getLastName" + seasonTicketLocations.getLastName());
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
