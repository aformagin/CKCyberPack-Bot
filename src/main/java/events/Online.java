package events;

import main.VarMap;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/*
 * This command will respond back with ONLINE! when the user enters !online,
 * which will allow users to know that the bot is up and working.
 */
public class Online extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        //Splits the message received into separate strings
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if(args[0].equalsIgnoreCase("!online")){
            if(!event.getMember().getUser().isBot()){//Checks to make sure the user is not a bot
                event.getChannel()
                        .sendMessage(VarMap.onlineOutput)
                        .queue();  //Sends the message ONLINE
            }

        }

    }
}
