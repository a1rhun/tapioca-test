package dtos;

public class TicketDTO {
    private Integer ticket_id;
    private String ticket_name;
    private Integer ticket_user;

    // Getters and Setters
    public Integer getTicketId() {
        return ticket_id;
    }

    public void setTicketId(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicketName() {
        return ticket_name;
    }

    public void setTicketName(String ticket_name) {
        this.ticket_name = ticket_name;
    }

    public Integer getTicketUser() {
        return ticket_user;
    }

    public void setTicketUser(Integer ticket_user) {
        this.ticket_user = ticket_user;
    }
}