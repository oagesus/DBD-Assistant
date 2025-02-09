package com.example.dbdguide;

import java.util.Arrays;
import java.util.List;

import android.content.Context;

public class CharacterSurvivorItemData {



    // Static method to return a list of ButtonItems
    public static List<CharacterItem> getButtonItems(Context context) {

        return Arrays.asList(
                new CharacterItem("<font color='#ffffff'><b>DWIGHT FAIRFIELD</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Bond</b></font>, <font color='#ffffff'><b>Leader</b></font> and <font color='#ffffff'><b>Prove&nbsp;Thyself</b></font>, allow him to get in proximity of other Survivors and provide bonuses to their actions as well as his own.",

                        "<font color='#aaa9a9'>A nervous leader, able to locate his allies and increase their effectiveness.</font>",
                        R.drawable.character_survivor_dwight, 1, Arrays.asList(R.drawable.survivor_bond, R.drawable.survivor_leader, R.drawable.survivor_prove_thyself)),
                new CharacterItem("<font color='#ffffff'><b>MEG THOMAS</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Adrenaline</b></font>, <font color='#ffffff'><b>Quick&nbsp;&&nbsp;Quiet</b></font> and <font color='#ffffff'><b>Sprint&nbsp;Burst</b></font>, give her advantage to escape chases and put distance between herself and the Killer.",

                        "<font color='#aaa9a9'>An energetic athlete, able to outrun most Killers.</font>",
                        R.drawable.character_survivor_meg, 2, Arrays.asList(R.drawable.survivor_adrenaline, R.drawable.survivor_quick_and_quiet, R.drawable.survivor_sprint_burst)),
                new CharacterItem("<font color='#ffffff'><b>CLAUDETTE MOREL</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Botany&nbsp;Knowledge</b></font>, <font color='#ffffff'><b>Empathy</b></font> and <font color='#ffffff'><b>Self&nbsp;Care</b></font>, allow her to spot injured Survivors and heal her team and herself more effectively.",

                        "<font color='#aaa9a9'>A studious botanist, able to boost her team's survivability as well as her own.</font>",
                        R.drawable.character_survivor_claudette, 3, Arrays.asList(R.drawable.survivor_botany_knowledge, R.drawable.survivor_empathy, R.drawable.survivor_self_care)),
                new CharacterItem("<font color='#ffffff'><b>JAKE PARK</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Calm&nbsp;Spirit</b></font>, <font color='#ffffff'><b>Iron&nbsp;Will</b></font> and <font color='#ffffff'><b>Saboteur</b></font>, allow him to more effectively move about the environment and survive while injured.",

                        "<font color='#aaa9a9'>A solitary survivalist, able to hold his own in most situations.</font>",
                        R.drawable.character_survivor_jake, 4, Arrays.asList(R.drawable.survivor_calm_spirit, R.drawable.survivor_iron_will, R.drawable.survivor_saboteur)),
                new CharacterItem("<font color='#ffffff'><b>NEA KARLSSON</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Balanced&nbsp;Landing</b></font>, <font color='#ffffff'><b>Streetwise</b></font> and <font color='#ffffff'><b>Urban&nbsp;Evasion</b></font>, make her well suited to completing objectives and rapid evasion.",

                        "<font color='#aaa9a9'>An urban artist, able to easily escape and hide.</font>",
                        R.drawable.character_survivor_nea, 5, Arrays.asList(R.drawable.survivor_balanced_landing, R.drawable.survivor_streetwise, R.drawable.survivor_urban_evasion)),
                new CharacterItem("<font color='#ffffff'><b>LAURIE STRODE</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Decisive&nbsp;Strike</b></font>, <font color='#ffffff'><b>Object&nbsp;of&nbsp;Obsession</b></font> and <font color='#ffffff'><b>Sole&nbsp;Survivor</b></font>, grant her powerful survival abilities at the cost of leaving her exposed.",

                        "<font color='#aaa9a9'>A determined Survivor, prepared to weather any challenge.</font>",
                        R.drawable.character_survivor_laurie, 6, Arrays.asList(R.drawable.survivor_decisive_strike, R.drawable.survivor_object_of_obsession, R.drawable.survivor_sole_survivor)),
                new CharacterItem("<font color='#ffffff'><b>ACE VISCONTI</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Ace&nbsp;in&nbsp;the&nbsp;Hole</b></font>, <font color='#ffffff'><b>Open&nbsp;Handed</b></font> and <font color='#ffffff'><b>Up&nbsp;the&nbsp;Ante</b></font>, boost the Luck of all Survivors and help with unlocking chests.",

                        "<font color='#aaa9a9'>A lucky gambler, improving the odds of the entire team.</font>",
                        R.drawable.character_survivor_ace, 7, Arrays.asList(R.drawable.survivor_ace_in_the_hole, R.drawable.survivor_open_handed, R.drawable.survivor_up_the_ante)),
                new CharacterItem("<font color='#ffffff'><b>WILLIAM &quot;BILL&quot; OVERBECK</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Borrowed&nbsp;Time</b></font>, <font color='#ffffff'><b>Left&nbsp;Behind</b></font> and <font color='#ffffff'><b>Unbreakable</b></font>, make him more powerful in dire moments.",

                        "<font color='#aaa9a9'>An old soldier, accustomed to dealing with critical situations.</font>",
                        R.drawable.character_survivor_bill, 8, Arrays.asList(R.drawable.survivor_borrowed_time, R.drawable.survivor_left_behind, R.drawable.survivor_unbreakable)),
                new CharacterItem("<font color='#ffffff'><b>FENG MIN</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Alert</b></font>, <font color='#ffffff'><b>Lithe</b></font> and <font color='#ffffff'><b>Technician</b></font>, help her with repairing generators and locating the Killer.",

                        "<font color='#aaa9a9'>An objective-focused competitor who can quickly adapt her strategy to meet a vast range of challenging situations.</font>",
                        R.drawable.character_survivor_feng, 9, Arrays.asList(R.drawable.survivor_alert, R.drawable.survivor_lithe, R.drawable.survivor_technician)),
                new CharacterItem("<font color='#ffffff'><b>DAVID KING</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Dead&nbsp;Hard</b></font>, <font color='#ffffff'><b>No&nbsp;Mither</b></font> and <font color='#ffffff'><b>We're&nbsp;Gonna&nbsp;Live&nbsp;Forever</b></font>, reward an aggressive, confrontational playstyle but leave him vulnerable.",

                        "<font color='#aaa9a9'>A rugged scrapper, rewarding high-risk play.</font>",
                        R.drawable.character_survivor_david, 10, Arrays.asList(R.drawable.survivor_dead_hard, R.drawable.survivor_no_mither, R.drawable.survivor_were_gonna_live_forever)),
                new CharacterItem("<font color='#ffffff'><b>KATE DENSON</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Boil&nbsp;Over</b></font>, <font color='#ffffff'><b>Dance&nbsp;With&nbsp;Me</b></font> and <font color='#ffffff'><b>Windows&nbsp;of&nbsp;Opportunity</b></font>, grant her the foresight and feistiness to escape even the most dire situations.",

                        "<font color='#aaa9a9'>A hopeful songbird, able to make the most of her surroundings.</font>",
                        R.drawable.character_survivor_kate, 11, Arrays.asList(R.drawable.survivor_boil_over, R.drawable.survivor_dance_with_me, R.drawable.survivor_windows_of_opportunity)),
                new CharacterItem("<font color='#ffffff'><b>QUENTIN SMITH</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Pharmacy</b></font>, <font color='#ffffff'><b>Vigil</b></font> and <font color='#ffffff'><b>Wake&nbsp;Up!</b></font>, help Survivors locate exit gates and recover more easily.",

                        "<font color='#aaa9a9'>A resolute dreamwalker, increasing the survivability and recovery of his team.</font>",
                        R.drawable.character_survivor_quentin, 12, Arrays.asList(R.drawable.survivor_pharmacy, R.drawable.survivor_vigil, R.drawable.survivor_wake_up)),
                new CharacterItem("<font color='#ffffff'><b>DETECTIVE TAPP</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Detective's&nbsp;Hunch</b></font>, <font color='#ffffff'><b>Stake&nbsp;Out</b></font> and <font color='#ffffff'><b>Tenacity</b></font>, make him objective-focused and able to rapidly recover.",

                        "<font color='#aaa9a9'>An obsessed detective, able to locate and complete objectives faster.</font>",
                        R.drawable.character_survivor_detective_tapp, 13, Arrays.asList(R.drawable.survivor_detectives_hunch, R.drawable.survivor_stake_out, R.drawable.survivor_tenacity)),
                new CharacterItem("<font color='#ffffff'><b>ADAM FRANCIS</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Autodidact</b></font>, <font color='#ffffff'><b>Deliverance</b></font> and <font color='#ffffff'><b>Diversion</b></font>, help him to distract The Killer, survive desperate situations, and become more skilled as the trial continues.",

                        "<font color='#aaa9a9'>A resourceful teacher, able to adapt to new circumstances and develop strategies accordingly.</font>",
                        R.drawable.character_survivor_adam, 14, Arrays.asList(R.drawable.survivor_autodidact, R.drawable.survivor_deliverance, R.drawable.survivor_diversion)),
                new CharacterItem("<font color='#ffffff'><b>JEFF JOHANSEN</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Aftercare</b></font>, <font color='#ffffff'><b>Breakdown</b></font> and <font color='#ffffff'><b>Distortion</b></font>, give him observational advantages and help to hide his presence from The Killer.",

                        "<font color='#aaa9a9'>A quiet artist, standing steadfast against impossible odds.</font>",
                        R.drawable.character_survivor_jeff, 15, Arrays.asList(R.drawable.survivor_aftercare, R.drawable.survivor_breakdown, R.drawable.survivor_distortion)),
                new CharacterItem("<font color='#ffffff'><b>JANE ROMERO</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Head&nbsp;On</b></font>, <font color='#ffffff'><b>Poised</b></font> and <font color='#ffffff'><b>Solidarity</b></font>, give her a flexible skillset that allow her to help others, as well as herself, to escape dangerous situations.",

                        "<font color='#aaa9a9'>An influential celebrity, going against the grain to tackle challenges head on.</font>",
                        R.drawable.character_survivor_jane, 16, Arrays.asList(R.drawable.survivor_head_on, R.drawable.survivor_poised, R.drawable.survivor_solidarity)),
                new CharacterItem("<font color='#ffffff'><b>ASHLEY J. WILLIAMS</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Buckle&nbsp;Up</b></font>, <font color='#ffffff'><b>Flip-Flop</b></font> and <font color='#ffffff'><b>Mettle&nbsp;of&nbsp;Man</b></font>, give him additional resilience to pain and hardship, as well as the ability to help his friends out of sticky situations.",

                        "<font color='#aaa9a9'>An &quot;alone wolf&quot;, cocky and headstrong; a man built for survival.</font>",
                        R.drawable.character_survivor_ash, 17, Arrays.asList(R.drawable.survivor_buckle_up, R.drawable.survivor_flip_flop, R.drawable.survivor_mettle_of_man)),
                new CharacterItem("<font color='#ffffff'><b>NANCY WHEELER</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Better&nbsp;Together</b></font>, <font color='#ffffff'><b>Fixated</b></font> and <font color='#ffffff'><b>Inner&nbsp;Strength</b></font>, give her the information and courage she needs to tackle unexpected challenges.",

                        "<font color='#aaa9a9'>An aspiring journalist, able to make acute observations and gain insights that others may miss.</font>",
                        R.drawable.character_survivor_nancy, 18, Arrays.asList(R.drawable.survivor_better_together, R.drawable.survivor_fixated, R.drawable.survivor_inner_strength)),
                new CharacterItem("<font color='#ffffff'><b>STEVE HARRINGTON</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Babysitter</b></font>, <font color='#ffffff'><b>Camaraderie</b></font> and <font color='#ffffff'><b>Second&nbsp;Wind</b></font>, enable him to distract Killers, tolerate pain, and get back into the fight.",

                        "<font color='#aaa9a9'>A former jock, able to protect and support his fellow Survivors while providing his own brand of humor.</font>",
                        R.drawable.character_survivor_steve, 19, Arrays.asList(R.drawable.survivor_babysitter, R.drawable.survivor_camaraderie, R.drawable.survivor_second_wind)),
                new CharacterItem("<font color='#ffffff'><b>YUI KIMURA</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Any&nbsp;Means&nbsp;Necessary</b></font>, <font color='#ffffff'><b>Breakout</b></font> and <font color='#ffffff'><b>Lucky&nbsp;Break</b></font>, enable her to cover her blood trails, reset dropped pallets, and assist helpless Survivors.",

                        "<font color='#aaa9a9'>A hardened street racer, able to gain advantages for her and her fellow Survivors in challenging situations.</font>",
                        R.drawable.character_survivor_yui, 20, Arrays.asList(R.drawable.survivor_any_means_necessary, R.drawable.survivor_breakout, R.drawable.survivor_lucky_break)),
                new CharacterItem("<font color='#ffffff'><b>ZARINA KASSIR</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>For&nbsp;the&nbsp;People</b></font>, <font color='#ffffff'><b>Off&nbsp;The&nbsp;Record</b></font> and <font color='#ffffff'><b>Red&nbsp;Herring</b></font>, enable her to cover her blood trails, reset dropped pallets, and assist helpless Survivors.",

                        "<font color='#aaa9a9'>A plucky documentarian, able to use her street smarts to avoid detection and greatly assist other Survivors.</font>",
                        R.drawable.character_survivor_zarina, 21, Arrays.asList(R.drawable.survivor_for_the_people, R.drawable.survivor_off_the_record, R.drawable.survivor_red_herring)),
                new CharacterItem("<font color='#ffffff'><b>CHERYL MASON</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Blood&nbsp;Pact</b></font>, <font color='#ffffff'><b>Repressed&nbsp;Alliance</b></font> and <font color='#ffffff'><b>Soul&nbsp;Guard</b></font>, allow her to survive through immense hardship, stay in contact with team members, and plan objectives.",

                        "<font color='#aaa9a9'>Cheryl Mason is a young veteran of terror, emboldening both herself and her team.</font>",
                        R.drawable.character_survivor_cheryl, 22, Arrays.asList(R.drawable.survivor_blood_pact, R.drawable.survivor_repressed_alliance, R.drawable.survivor_soul_guard)),
                new CharacterItem("<font color='#ffffff'><b>FELIX RICHTER</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Built&nbsp;to&nbsp;Last</b></font>, <font color='#ffffff'><b>Desperate&nbsp;Measures</b></font> and <font color='#ffffff'><b>Visionary</b></font>, help him reveal generators, rescue Survivors, and get the most from his tools.",

                        "<font color='#aaa9a9'>A visionary architect, able to use his relentless determination to form a plan and help other Survivors.</font>",
                        R.drawable.character_survivor_felix, 23, Arrays.asList(R.drawable.survivor_built_to_last, R.drawable.survivor_desperate_measures, R.drawable.survivor_visionary)),
                new CharacterItem("<font color='#ffffff'><b>ÉLODIE RAKOTO</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Appraisal</b></font>, <font color='#ffffff'><b>Deception</b></font> and <font color='#ffffff'><b>Power&nbsp;Struggle</b></font>, allow her to interact with objects in new ways, all while having a backup plan to escape Killers.",

                        "<font color='#aaa9a9'>An occult investigator, able to use cunning tricks and stubborn resolve to keep herself alive.</font>",
                        R.drawable.character_survivor_elodie, 24, Arrays.asList(R.drawable.survivor_appraisal, R.drawable.survivor_deception, R.drawable.survivor_power_struggle)),
                new CharacterItem("<font color='#ffffff'><b>YUN-JIN LEE</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Fast&nbsp;Track</b></font>, <font color='#ffffff'><b>Self-Preservation</b></font> and <font color='#ffffff'><b>Smash&nbsp;Hit</b></font>, allow her to improve her abilities when others are harmed, and quickly escape from a chase.",

                        "<font color='#aaa9a9'>A self-interested music producer, able to advance her goals during turbulent times.</font>",
                        R.drawable.character_survivor_yun_jin, 25, Arrays.asList(R.drawable.survivor_fast_track, R.drawable.survivor_self_preservation, R.drawable.survivor_smash_hit)),
                new CharacterItem("<font color='#ffffff'><b>JILL VALENTINE</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Blast&nbsp;Mine</b></font>, <font color='#ffffff'><b>Counterforce</b></font> and <font color='#ffffff'><b>Resurgence</b></font>, allow her to indirectly fight back, while offering strong support to her teammates.",

                        "<font color='#aaa9a9'>Jill Valentine is a founding member of S.T.A.R.S. who has triumphed over countless bio-organic weapons.</font>",
                        R.drawable.character_survivor_jill, 26, Arrays.asList(R.drawable.survivor_blast_mine, R.drawable.survivor_counterforce, R.drawable.survivor_resurgence)),
                new CharacterItem("<font color='#ffffff'><b>LEON S. KENNEDY</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Bite&nbsp;the&nbsp;Bullet</b></font>, <font color='#ffffff'><b>Flashbang</b></font> and <font color='#ffffff'><b>Rookie&nbsp;Spirit</b></font>, allow him to ignore pain, disorient the Killer, and track objectives being lost.",

                        "<font color='#aaa9a9'>Leon S. Kennedy is a rookie police officer who went beyond the call of duty during the outbreak in Raccoon City.</font>",
                        R.drawable.character_survivor_leon, 27, Arrays.asList(R.drawable.survivor_bite_the_bullet, R.drawable.survivor_flashbang, R.drawable.survivor_rookie_spirit)),
                new CharacterItem("<font color='#ffffff'><b>MIKAELA REID</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Boon:&nbsp;Circle&nbsp;of&nbsp;Healing</b></font>, <font color='#ffffff'><b>Boon:&nbsp;Shadow&nbsp;Step</b></font> and <font color='#ffffff'><b>Clairvoyance</b></font>, allow her to oversee the area while creating places of refuge.",

                        "<font color='#aaa9a9'>Mikaela is a young mystic, able to alter the trial with supernatural abilities.</font>",
                        R.drawable.character_survivor_mikaela, 28, Arrays.asList(R.drawable.survivor_boon_circle_of_healing, R.drawable.survivor_boon_shadow_step, R.drawable.survivor_clairvoyance)),
                new CharacterItem("<font color='#ffffff'><b>JONAH VASQUEZ</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Boon:&nbsp;Exponential</b></font>, <font color='#ffffff'><b>Corrective&nbsp;Action</b></font> and <font color='#ffffff'><b>Overcome</b></font>, allow him to quickly flee, correct failed skill checks, and treat dying Survivors.",

                        "<font color='#aaa9a9'>Jonah is a mathematical mastermind, able to use logic to help his team.</font>",
                        R.drawable.character_survivor_jonah, 29, Arrays.asList(R.drawable.survivor_boon_exponential, R.drawable.survivor_corrective_action, R.drawable.survivor_overcome)),
                new CharacterItem("<font color='#ffffff'><b>YOICHI ASAKAWA</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Boon:&nbsp;Dark&nbsp;Theory</b></font>, <font color='#ffffff'><b>Empathic&nbsp;Connection</b></font> and <font color='#ffffff'><b>Parental&nbsp;Guidance</b></font>, allow him to hide from Killers, call out to injured Survivors, and help others move faster.",

                        "<font color='#aaa9a9'>Yoichi is a brilliant marine biologist and psychic whose knowledge and abilities allow him to protect himself and assist others.</font>",
                        R.drawable.character_survivor_yoichi, 30, Arrays.asList(R.drawable.survivor_boon_dark_theory, R.drawable.survivor_empathic_connection, R.drawable.survivor_parental_guidance)),
                new CharacterItem("<font color='#ffffff'><b>ADDIE KAUR</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Inner&nbsp;Focus</b></font>, <font color='#ffffff'><b>Residual&nbsp;Manifest</b></font> and <font color='#ffffff'><b>Overzealous</b></font>, allow her to track Survivors and Killers after an attack, use Flashlights more effectively, and repair generators more efficiently.",

                        "<font color='#aaa9a9'>Haddie is a brave and determined podcaster with the ability to see and feel places of great suffering she calls Overlaps.</font>",
                        R.drawable.character_survivor_haddie, 31, Arrays.asList(R.drawable.survivor_inner_focus, R.drawable.survivor_residual_manifest, R.drawable.survivor_overzealous)),
                new CharacterItem("<font color='#ffffff'><b>ADA WONG</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Low&nbsp;Profile</b></font>, <font color='#ffffff'><b>Reactive&nbsp;Healing</b></font> and <font color='#ffffff'><b>Wiretap</b></font>, allow her to spy on a Killer, gain a surge of healing when her allies are hurt, and leave no trace when she is the final Survivor.",

                        "<font color='#aaa9a9'>Ada Wong is a mysterious secret agent whose skill in espionage makes her a dangerous foe.</font>",
                        R.drawable.character_survivor_ada, 32, Arrays.asList(R.drawable.survivor_low_profile, R.drawable.survivor_reactive_healing, R.drawable.survivor_wiretap)),
                new CharacterItem("<font color='#ffffff'><b>REBECCA CHAMBERS</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Better&nbsp;Than&nbsp;New</b></font>, <font color='#ffffff'><b>Hyperfocus</b></font> and <font color='#ffffff'><b>Reassurance</b></font>, allow her to give her teammates speed boosts, give temporary relief to struggling allies, and complete skill checks at increased speed.",

                        "<font color='#aaa9a9'>Rebecca Chambers is a gifted medic and squad member whose presence soothes those around her.</font>",
                        R.drawable.character_survivor_rebecca, 33, Arrays.asList(R.drawable.survivor_better_than_new, R.drawable.survivor_hyperfocus, R.drawable.survivor_reassurance)),
                new CharacterItem("<font color='#ffffff'><b>VITTORIO TOSCANO</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Fogwise</b></font>, <font color='#ffffff'><b>Potential&nbsp;Energy</b></font> and <font color='#ffffff'><b>Quick&nbsp;Gambit</b></font>, allow him to store generator progress to use later, reveal the Killer's location after a great Skill Check, and give others a speed boost while repairing.",

                        "<font color='#aaa9a9'>Vittorio has endlessly wandered through the Fog, attempting to learn its secrets, for ages.</font>",
                        R.drawable.character_survivor_vittorio, 34, Arrays.asList(R.drawable.survivor_fogwise, R.drawable.survivor_potential_energy, R.drawable.survivor_quick_gambit)),
                new CharacterItem("<font color='#ffffff'><b>THALITA LYRA</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Cut&nbsp;Loose</b></font>, <font color='#ffffff'><b>Friendly&nbsp;Competition</b></font> and <font color='#ffffff'><b>Teamwork:&nbsp;Power&nbsp;of&nbsp;Two</b></font>, allow her to perform a series of fast vaults, inspire faster generator repair from teammates, and help allies move faster after they are healed by you.",

                        "<font color='#aaa9a9'>Thalita has mastered the art of competitive flair, fighting kites with skill and flourish.</font>",
                        R.drawable.character_survivor_thalita, 35, Arrays.asList(R.drawable.survivor_cut_loose, R.drawable.survivor_friendly_competition, R.drawable.survivor_teamwork_power_of_two)),
                new CharacterItem("<font color='#ffffff'><b>RENATO LYRA</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Background&nbsp;Player</b></font>, <font color='#ffffff'><b>Blood&nbsp;Rush</b></font> and <font color='#ffffff'><b>Teamwork:&nbsp;Collective&nbsp;Stealth</b></font>, allow him to move faster when near a chase, recover from Exhausted instantly, and hide your and an allies' scratch marks after that ally heals you.",

                        "<font color='#aaa9a9'>Renato always keeps his eye on the prize, and he expects the same from his teammates.</font>",
                        R.drawable.character_survivor_renato, 36, Arrays.asList(R.drawable.survivor_background_player, R.drawable.survivor_blood_rush, R.drawable.survivor_teamwork_collective_stealth)),
                new CharacterItem("<font color='#ffffff'><b>GABRIEL SOMA</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Made&nbsp;For&nbsp;This</b></font>, <font color='#ffffff'><b>Scavenger</b></font> and <font color='#ffffff'><b>Troubleshooter</b></font>, help him see things during a chase, gain Endurance after healing Survivors, and recharge his toolbox.",

                        "<font color='#aaa9a9'>A resourceful engineer, ready to make the most out of any situation.</font>",
                        R.drawable.character_survivor_gabriel, 37, Arrays.asList(R.drawable.survivor_made_for_this, R.drawable.survivor_scavenger, R.drawable.survivor_troubleshooter)),
                new CharacterItem("<font color='#ffffff'><b>NICOLAS CAGE</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Dramaturgy</b></font>, <font color='#ffffff'><b>Plot&nbsp;Twist</b></font> and <font color='#ffffff'><b>Scene&nbsp;Partner</b></font>, help him make a quick escape, see the Killer’s aura, and pretend to be dying.",

                        "<font color='#aaa9a9'>Nicolas Cage is a superstar, trapped in the role of a lifetime.</font>",
                        R.drawable.character_survivor_nicolas, 38, Arrays.asList(R.drawable.survivor_dramaturgy, R.drawable.survivor_plot_twist, R.drawable.survivor_scene_partner)),
                new CharacterItem("<font color='#ffffff'><b>ELLEN RIPLEY</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Chemical&nbsp;Trap</b></font>, <font color='#ffffff'><b>Light&#8288;-&#8288;footed</b></font> and <font color='#ffffff'><b>Lucky&nbsp;Star</b></font>, let her hide her pools of blood and grunts of pain, slow Killers with trapped pallets, and run silently.",

                        "<font color='#aaa9a9'>Ellen Ripley, Warrant Officer of the Nostromo, is capable and pragmatic.</font>",
                        R.drawable.character_survivor_ellen, 39, Arrays.asList(R.drawable.survivor_chemical_trap, R.drawable.survivor_light_footed, R.drawable.survivor_lucky_star)),
                new CharacterItem("<font color='#ffffff'><b>ALAN WAKE</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Boon:&nbsp;Illumination</b></font>, <font color='#ffffff'><b>Champion&nbsp;of&nbsp;Light</b></font> and <font color='#ffffff'><b>Deadline</b></font>, make Flashlights more powerful, reveal chests and generators, and create more frequent Skill Checks.",

                        "<font color='#aaa9a9'>Alan Wake, bestselling author, knows what it means to push back the darkness.</font>",
                        R.drawable.character_survivor_alan, 40, Arrays.asList(R.drawable.survivor_boon_illumination, R.drawable.survivor_champion_of_light, R.drawable.survivor_deadline)),
                new CharacterItem("<font color='#ffffff'><b>SABLE WARD</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Invocation:&nbsp;Weaving&nbsp;Spiders</b></font>, <font color='#ffffff'><b>Strength&nbsp;in&nbsp;Shadows</b></font> and <font color='#ffffff'><b>Wicked</b></font>, allow her to quicken repair progress, heal herself without a Med-kit, and escape the basement hooks.",

                        "<font color='#aaa9a9'>Sable is not afraid to embrace the darkness, or the power that lies within it.</font>",
                        R.drawable.character_survivor_sable, 41, Arrays.asList(R.drawable.survivor_invocation_weaving_spiders, R.drawable.survivor_strength_in_shadows, R.drawable.survivor_wicked)),
                new CharacterItem("<font color='#ffffff'><b>AESTRI YAZAR</b></font>",
                        "<font color='#aaa9a9'>Their personal perks, <font color='#ffffff'><b>Bardic&nbsp;Inspiration</b></font>, <font color='#ffffff'><b>Mirrored&nbsp;Illusion</b></font> and <font color='#ffffff'><b>Still&nbsp;Sight</b></font>, allow them to create illusions, help others repair generators quicker, and see nearby Killers, generators, and chests.",

                        "<font color='#aaa9a9'>Aestri, fellow bard Baermar, and their troupe never back down from any adventure.</font>",
                        R.drawable.character_survivor_aestri, 42, Arrays.asList(R.drawable.survivor_bardic_inspiration, R.drawable.survivor_mirrored_illusion, R.drawable.survivor_still_sight)),
                new CharacterItem("<font color='#ffffff'><b>LARA CROFT</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Finesse</b></font>, <font color='#ffffff'><b>Hardened</b></font> and <font color='#ffffff'><b>Specialist</b></font>, allow her to reveal the killer instead of screaming, repair generators more efficiently, and fast vault faster.",

                        "<font color='#aaa9a9'>Lara Croft's instincts have been honed by her many dangerous expeditions.</font>",
                        R.drawable.character_survivor_lara, 43, Arrays.asList(R.drawable.survivor_finesse, R.drawable.survivor_hardened, R.drawable.survivor_specialist)),
                new CharacterItem("<font color='#ffffff'><b>TREVOR BELMONT</b></font>",
                        "<font color='#aaa9a9'>His personal perks, <font color='#ffffff'><b>Exultation</b></font>, <font color='#ffffff'><b>Eyes&nbsp;of&nbsp;Belmont</b></font> and <font color='#ffffff'><b>Moment&nbsp;of&nbsp;Glory</b></font>, allow him to see the Killer's aura, increase an item's rarity, and heal one health state.",

                        "<font color='#aaa9a9'>Trevor Belmont, vampire hunter, knows his destiny is to vanquish evil.</font>",
                        R.drawable.character_survivor_trevor, 44, Arrays.asList(R.drawable.survivor_exultation, R.drawable.survivor_eyes_of_belmont, R.drawable.survivor_moment_of_glory)),
                new CharacterItem("<font color='#ffffff'><b>TAURIE CAIN</b></font>",
                        "<font color='#aaa9a9'>Her personal perks, <font color='#ffffff'><b>Clean&nbsp;Break</b></font>, <font color='#ffffff'><b>Invocation:&nbsp;Treacherous&nbsp;Crows</b></font> and <font color='#ffffff'><b>Shoulder&nbsp;the&nbsp;Burden</b></font>, allow her to reveal the Killer's aura, heal after being Broken, and take on another Survivor’s hook state.",

                        "<font color='#aaa9a9'>Taurie Cain was raised as a Disciple of the Black Talon, condemned to be a sacrifice.</font>",
                        R.drawable.character_survivor_taurie, 45, Arrays.asList(R.drawable.survivor_clean_break, R.drawable.survivor_invocation_treacherous_crows, R.drawable.survivor_shoulder_the_burden))
        );
    }
}