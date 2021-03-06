package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Business extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"BusinessAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Business Team Announcement:");
            success.setDescription("Business team! Activities should have finished all details of the upcoming content, please communicate and collaborate to find what we need and how we'll get it! :D");
            success.setFooter("Director: Troy Osborn");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"BusinessUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Business Team Update:");
            success.setDescription("Business team! Please try to ensure that all work and resource management is finished to hand off everything to Leadership! :D");
            success.setFooter("Director: Troy Osborn");
            event.getChannel().sendMessage(success.build()).queue();

        }

    }
}
