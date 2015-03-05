/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kurtomerfaruk.primefacesimage;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Omer Faruk
 */
@ManagedBean
@ApplicationScoped
public class ImageUpload {

    private StreamedContent image = null;

    public StreamedContent getImage() {
        return image;
    }

    public void setImage(StreamedContent image) {
        this.image = image;
    }

    public void enterImage(FileUploadEvent e) {
        try {
            UploadedFile file = e.getFile();
            image = new DefaultStreamedContent(file.getInputstream(), "image/jpeg");
        } catch (Exception ex) {
            System.out.println("hata:" + ex.getMessage());
        }
    }
}
