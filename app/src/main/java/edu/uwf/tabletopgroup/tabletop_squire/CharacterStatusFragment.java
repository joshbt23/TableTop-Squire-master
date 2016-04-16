package edu.uwf.tabletopgroup.tabletop_squire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.uwf.tabletopgroup.models.Character;
import edu.uwf.tabletopgroup.models.User;

/**
 * Created by Teel on 4/4/2016.
 */
public class CharacterStatusFragment{
    public static final String CHARACTER_KEY = "character";
    private Character character;
    private TextView usernameTV;
    private TextView nameTV;
    private TextView classTV;
    private TextView constitutionTV;
    private TextView wisdomTV;

    public static CharacterStatusFragment newInstance(String id) {
        CharacterStatusFragment characterStatusFragment = new CharacterStatusFragment();
        Bundle args = new Bundle();
        args.putSerializable(CHARACTER_KEY, id);
        return characterStatusFragment;
    }

    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view_character, container, false);
        if(character != null)
            initializeTextViews(v);
        return v;
    }

    private void initializeTextViews(View v){
        usernameTV = (TextView)v.findViewById(R.id.username);
        usernameTV.setText(character.getName());
        nameTV = (TextView)v.findViewById(R.id.name);
        nameTV.setText(character.getName());
        TextView raceTV;
        raceTV = (TextView) v.findViewById(R.id.race);
        raceTV.setText(character.getRace());
        classTV = (TextView)v.findViewById(R.id.character_class);
        classTV.setText(character.getCharacterClass());
        TextView levelTV = (TextView) v.findViewById(R.id.level);
        levelTV.setText(String.valueOf(character.getLevel()));
        constitutionTV = (TextView)v.findViewById(R.id.constitution);
        constitutionTV.setText(String.valueOf(character.getConstitution()));
        wisdomTV = (TextView)v.findViewById(R.id.wisdom);
        wisdomTV.setText(String.valueOf(character.getWisdom()));

    }


}

