package controller.servlet.command;

import model.entity.User;
import model.service.LoadAllUsersService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class AdministratorCommand implements ICommand {
    LoadAllUsersService loadAllUsersService = new LoadAllUsersService();

    @Override
    public String execute(HttpServletRequest request) {

    List <User> userList = loadAllUsersService.getAllUsers();






/*


        int currentPage = Integer.valueOf(request.getParameter("currentPage"));
        int recordsPerPage = Integer.valueOf(request.getParameter("recordsPerPage"));

        CountryService countryService = new CountryService(); // todo + запрос в базу данных




        int rows = countryService.getNumberOfRows();

        int nOfPages = rows / recordsPerPage;

        if (rows % recordsPerPage > 0) {
            nOfPages++;
        }
        if (currentPage > nOfPages) {
            currentPage = nOfPages;
        }
        List<Country> countries = countryService.findCountries(currentPage,
                recordsPerPage);

        request.setAttribute("noOfPages", nOfPages);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("recordsPerPage", recordsPerPage);
        request.setAttribute("countries", countries);





*/










        request.setAttribute("userList", userList);


  //  return "redirect:/administrator";
    return "/WEB-INF/util/administrator/administrator.jsp";

    }
}
