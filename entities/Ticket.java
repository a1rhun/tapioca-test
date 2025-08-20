package entities;

public class Ticket {
    private Integer ticketId;
    private Integer ticketUser;
    private String ticketName;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketUser() {
        return ticketUser;
    }

    public void setTicketUser(Integer ticketUser) {
        this.ticketUser = ticketUser;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
}