package dtos;

public class TicketDTO {
    private Integer ticketId;
    private String ticketName;
    private Integer ticketUser;

    // Getters and Setters
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Integer getTicketUser() {
        return ticketUser;
    }

    public void setTicketUser(Integer ticketUser) {
        this.ticketUser = ticketUser;
    }
}