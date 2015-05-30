package net.daansander.coder;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.math.BigDecimal;

/**
 * Created by Daan on 22-5-2015.
 */

/**
 * implements Listener is zodat bukkit weet dat hier evenementen afspelen
 */
public class Coder extends JavaPlugin implements Listener {
    /**
     * CoderDojo Cheat Sheat door Daan Meijer
     * @author Daan Meijer
     */
  /**
  * int = een normaal nummer en kan maximaal  2^31-1 hebben.
  * double = een normaal nummer met decimalen zoals: 10.34531
  * boolean = is een schakelaar het kan waar of niet waar zijn
  * long = is groot het kan een heel groot getal zijn zoals: 9349641242334513
  * float = is een soort van double
  * byte = is erg klein
  * short = is een soort van byte maar dan groter
  * 
  * public = open voor elke class
  * protected = alleen voor classes die het 'extenden'
  * private = is alleen voor de class zelf
  * static = is open voor iedereen
  * final = kan je niet veranderen
  * synchronized = heeft voorang op alle codes
  * 
  * 
  * new = maak een nieuwe instancie aan van een class
  * throw = gooi een error
  * abstract = methods die in de class moeten zitten
  * interface = volledig abstracte methods
  * 
  */

    public void onEnable() {
        //Hiermee kun je events registreren
        /**
         * this staat voor deze class
         */
        Bukkit.getServer().getPluginManager().registerEvents(this , this);
        //Hier maken wij een 'Runnable aan' die om de seconde iets doet
        Bukkit.getServer().getScheduler().runTaskTimer(this, new Runnable() {
            @Override
            public void run() {
                //Hier gaat gebeuren dat op de server iedere 1 seconde de bericht "1 Seconde voorbij" wordt gebroadcast(gestuurd)
                Bukkit.broadcastMessage("1 Seconde voorbij");
            }
            //Java werkt in 'ticks' 20 ticks zijn 1 seconde dus 10 ticks is een halve seconde
        },0, 20l);
    }

    //Hiermee wordt een event aangegeven
    @EventHandler
    //onPlayerJoin is de naam je kan er zelf wat voor verzinnen
    //PlayerJoinEvent is een van de vele evenementen ik neem deze als voorbeeld
    //Als je een beetje engels zie je Player dus de player Join dus met als de player het spel joind en Event en dan is dan het Event
    //Dus deze event wordt gecalled wanneer er een player joind
    public void onPlayerJoin(PlayerJoinEvent e) {
        //Hier kan je dingen in uit voeren als iemand joind
    }

    //Dit is voor een command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //Hier checken wij of de command maakt niet uit in hoofdletters of niet "command" is
        if(cmd.getName().equalsIgnoreCase("command")) {
            //Hier kunnen we dingen uitvoeren als de command "command wordt uitgevoerd"
        }
        return true;
    }
}
