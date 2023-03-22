package dk.javahandson.dal;

import dk.javahandson.be.Event;
import dk.javahandson.be.Ticket;
import dk.javahandson.be.User;
import dk.javahandson.be.Voucher;

import java.sql.SQLException;
import java.util.List;

public class DataAccessFacade {
    private EventDAO eventDAO = new EventDAO();
    private TicketDAO ticketDAO = new TicketDAO();
    private UserDAO userDAO = new UserDAO();
    private VoucherDAO voucherDAO = new VoucherDAO();


    /*
    Methods used to access Event DAO
     */

    public List<Event> getAllEvents() throws SQLException {
        return eventDAO.getAllEvents();
    }
    public List<Event> getCoordinatorEvents(User u) throws SQLException {
        return eventDAO.getCoordinatorEvents(u);
    }
    public void createEvent(Event event) throws SQLException {
        eventDAO.createEvent(event);
    }
    public boolean deleteEvent(Event event) throws SQLException {
        return eventDAO.deleteEvent(event);
    }
    public void updateEvent(Event event) throws SQLException {
        eventDAO.updateEvent(event);
    }
    public void getEventId(Event event) throws SQLException {
        eventDAO.getEventId(event);
    }
    
    /*
    Methods used to access TicketDAO
     */

    public void createTicket(Ticket ticket) throws SQLException {
        ticketDAO.createTicket(ticket);
    }
    public boolean deleteTicket(Ticket ticket) throws SQLException {
        return ticketDAO.deleteTicket(ticket);
    }
    public void updateTicket(Ticket ticket) throws SQLException {
        ticketDAO.updateTicket(ticket);
    }
    public void redeemTicket(Ticket ticket) throws SQLException {
        ticketDAO.redeemTicket(ticket);
    }
    public List<Ticket> getAllTickets() throws SQLException {
        return ticketDAO.getAllTickets();
    }

    /*
    Methods used to access UserDAO
     */

    public void createUser(User user) throws SQLException {
        userDAO.createUser(user);
    }
    public boolean deleteUser(User user) throws SQLException {
        return userDAO.deleteUser(user);
    }
    public void updateUser(User user) throws SQLException {
        userDAO.updateUser(user);
    }
    public void addUserToEvent(Event event, User user) throws SQLException {
        userDAO.addUserToEvent(event, user);
    }

    /*
    Methods used to access VoucherDAO
     */

    public List<Voucher> getAllVouchers() throws SQLException {
        return voucherDAO.getAllVouchers();
    }
    public boolean deleteVoucher(Voucher voucher) throws SQLException {
        return voucherDAO.deleteVoucher(voucher);
    }
    public void createVoucher (Voucher voucher) throws SQLException {
        voucherDAO.createVoucher(voucher);
    }


}
