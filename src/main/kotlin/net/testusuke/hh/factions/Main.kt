package net.testusuke.hh.factions

import org.bukkit.plugin.java.JavaPlugin

class Main:JavaPlugin() {

    companion object{
        //  plugin instance
        lateinit var plugin: Main
        //  plugin status
        var enabled = false
    }

    override fun onEnable() {
        //  instance
        plugin = this



        //  status
        enabled = true
    }

    override fun onDisable() {
        //  status
        enabled = false

    }
}