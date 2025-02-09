package com.example.dbdguide;

import android.graphics.Color;

public class TagColor {
    // Method to return color based on the tag
    public static int getColorForTag(String tag) {
        if (tag == null) return Color.GRAY; // Default color for null tags

        switch (tag.toLowerCase()) { // Convert the tag to uppercase

            //***KILLER TAGS***
            case "aura":
                return Color.parseColor("#265D80");
            case "blindness":
                return Color.parseColor("#243E7A");
            case "broken":
                return Color.parseColor("#5B81C2");
            case "carrying":
                return Color.parseColor("#805830");
            case "chase":
                return Color.parseColor("#674FAA");
            case "end game":
                return Color.parseColor("#4D8030");
            case "exhaustion":
                return Color.parseColor("#842344");
            case "exposed":
                return Color.parseColor("#7A2384");
            case "gen defense":
                return Color.parseColor("#392680");
            case "haste":
                return Color.parseColor("#282E57");
            case "healing":
                return Color.parseColor("#802626");
            case "hemorrhage":
                return Color.parseColor("#301D6D");
            case "hex":
                return Color.parseColor("#308077");
            case "hindered":
                return Color.parseColor("#BA4570");
            case "hook":
                return Color.parseColor("#2D5921");
            case "mangled":
                return Color.parseColor("#21594F");
            case "oblivious":
                return Color.parseColor("#26804B");
            case "obsession":
                return Color.parseColor("#98852F");
            case "scourge hook":
                return Color.parseColor("#AA4F4F");
            case "scream":
                return Color.parseColor("#202F46");
            case "slug":
                return Color.parseColor("#421F1F");
            case "terror radius":
                return Color.parseColor("#AA5D50");
            case "undetectable":
                return Color.parseColor("#C3763C");
            case "default":
            case "claustrophobia":
            case "fearmonger":
            case "jolt":
                return Color.GRAY;
            case "artist":
            case "blight":
            case "cannibal":
            case "cenobite":
            case "clown":
            case "dark lord":
            case "deathslinger":
            case "demogorgon":
            case "doctor":
            case "dredge":
            case "executioner":
            case "ghost face":
            case "good guy":
            case "hag":
            case "hillbilly":
            case "houndmaster":
            case "huntress":
            case "knight":
            case "legion":
            case "lich":
            case "mastermind":
            case "nemesis":
            case "nightmare":
            case "nurse":
            case "oni":
            case "pig":
            case "plague":
            case "shape":
            case "singularity":
            case "skull merchant":
            case "spirit":
            case "trapper":
            case "trickster":
            case "twins":
            case "unknown":
            case "wraith":
            case "xenomorph":
            case "onryō":
                return Color.parseColor("#ffffff");

            //***SURVIVOR TAGS***
            case "boon":
                return Color.parseColor("#21594F");
            case "endurance":
                return Color.parseColor("#26804B");
            case "exit gate":
                return Color.parseColor("#C3763C");
            case "healthy":
                return Color.parseColor("#84AC35");
            case "invocation":
                return Color.parseColor("#AA5D50");
            case "injured":
                return Color.parseColor("#243E7A");
            case "item":
                return Color.parseColor("#805830");
            case "killer aura":
                return Color.parseColor("#7A2384");
            case "pallet":
                return Color.parseColor("#392680");
            case "repairing":
                return Color.parseColor("#301D6D");
            case "stun":
                return Color.parseColor("#AA4F4F");
            case "totem":
                return Color.parseColor("#308077");
            case "wiggle":
                return Color.parseColor("#BA4570");
            case "guardian":
            case "inner healing":
            case "kinship":
            case "renewal":
            case "self-aware":
            case "situational awareness":
                return Color.GRAY;
            case "ace":
            case "ada":
            case "adam":
            case "aestri":
            case "alan":
            case "ash":
            case "bill":
            case "cheryl":
            case "claudette":
            case "david":
            case "detective tapp":
            case "dwight":
            case "ellen":
            case "felix":
            case "feng":
            case "gabriel":
            case "haddie":
            case "jake":
            case "jane":
            case "jeff":
            case "jill":
            case "jonah":
            case "kate":
            case "lara":
            case "laurie":
            case "leon":
            case "meg":
            case "mikaela":
            case "nancy":
            case "nea":
            case "nicolas":
            case "quentin":
            case "rebecca":
            case "renato":
            case "sable":
            case "steve":
            case "taurie":
            case "thalita":
            case "trevor":
            case "vittorio":
            case "yoichi":
            case "yui":
            case "yun-jin":
            case "zarina":
            case "élodie":
                return Color.parseColor("#ffffff");
            default:
                return Color.GRAY;
        }
    }
}