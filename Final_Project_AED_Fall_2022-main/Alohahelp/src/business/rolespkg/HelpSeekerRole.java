/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.rolespkg;

import business.EcoSystem;
import business.enterprisemainpkg.Enterprise;
import business.orgapkg.Orga;
import business.userAccountpkg.UserAc;
import javax.swing.JPanel;
import userInterface.helpSeeker.HelpSeekerWorkAreaJPanel;

/**
 *
 * @author shiba
 */
public class HelpSeekerRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAc account, 
            Orga organization, Enterprise enterprise, EcoSystem business) {
        return new HelpSeekerWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
