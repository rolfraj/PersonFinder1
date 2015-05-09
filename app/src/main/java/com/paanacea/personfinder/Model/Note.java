package com.paanacea.personfinder.Model;

import org.simpleframework.xml.Element;

import java.util.Date;

/**
 * Created by rolfraj on 1/5/15.
 */
public class Note {
    @Element
    private String note_record_id;

    @Element
    private Date entry_date;

    @Element
    private String author_name;

    @Element
    private String author_email;

    @Element
    private String author_phone;

    @Element
    private Date source_date;

    @Element
    private boolean found;

    @Element
    private String email_of_found_person;

    @Element
    private String phone_of_found_person;

    @Element
    private String last_known_location;

    @Element
    private String text;

    public String getNote_record_id() {
        return note_record_id;
    }
    public void setNote_record_id(String note_record_id) {
        this.note_record_id = note_record_id;
    }
    public Date getEntry_date() {
        return entry_date;
    }
    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }
    public String getAuthor_name() {
        return author_name;
    }
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
    public String getAuthor_email() {
        return author_email;
    }
    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }
    public String getAuthor_phone() {
        return author_phone;
    }
    public void setAuthor_phone(String author_phone) {
        this.author_phone = author_phone;
    }
    public Date getSource_date() {
        return source_date;
    }
    public void setSource_date(Date source_date) {
        this.source_date = source_date;
    }
    public boolean isFound() {
        return found;
    }
    public void setFound(boolean found) {
        this.found = found;
    }
    public String getEmail_of_found_person() {
        return email_of_found_person;
    }
    public void setEmail_of_found_person(String email_of_found_person) {
        this.email_of_found_person = email_of_found_person;
    }
    public String getPhone_of_found_person() {
        return phone_of_found_person;
    }
    public void setPhone_of_found_person(String phone_of_found_person) {
        this.phone_of_found_person = phone_of_found_person;
    }
    public String getLast_known_location() {
        return last_known_location;
    }
    public void setLast_known_location(String last_known_location) {
        this.last_known_location = last_known_location;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
