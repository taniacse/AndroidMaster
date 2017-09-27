package com.tania.androidmaster.main.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tania.androidmaster.R;
import com.tania.androidmaster.main.adapter.BasicListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BasicFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BasicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BasicFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView basicTopicList;
    ArrayList<String> arrayList = new ArrayList<>();
    FragmentManager fragmentManager;
    private OnFragmentInteractionListener mListener;

    public BasicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BasicFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BasicFragment newInstance(String param1, String param2) {
        BasicFragment fragment = new BasicFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View inflaterView = inflater.inflate(R.layout.fragment_basic, container, false);

        basicTopicList = (ListView) inflaterView.findViewById(R.id.basicList);

        arrayList.add("What is Android and Android Studio ?");
        arrayList.add("How To install Android Studio and Java on your PC");
        arrayList.add("How to configure an Emulator or use your  Android Device for Build Your App");
        arrayList.add("How to Build a Simple app On your Android Studio ");
        arrayList.add("Basic or Main topics For Android");
        arrayList.add("Some Simple App Example");
        arrayList.add("Some useful Step wise video tutorial ");
        arrayList.add("Reference and useful Link");


        Log.d("ArrayList ", " ArrayList" + arrayList);

        BasicListAdapter basicListAdapter = new BasicListAdapter(getActivity(),arrayList);

        basicTopicList.setAdapter(basicListAdapter);
       fragmentManager = getActivity().getSupportFragmentManager();

        basicTopicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int position = i;

                if (position == 0)
                {
                    FragmentAndroid fragmentAndroid = new FragmentAndroid();
                    fragmentManager.beginTransaction().replace(R.id.container_body, fragmentAndroid).commit();



                }else if (position == 1){

                    FragmentJDKAndroidStudio fragmentJDKAndroidStudio = new FragmentJDKAndroidStudio();
                    fragmentManager.beginTransaction().replace(R.id.container_body, fragmentJDKAndroidStudio).commit();



                }else if (position == 2){

                    FragmentConfigureEmulatorStepOne fragmentConfigureEmulatorStepOne = new FragmentConfigureEmulatorStepOne();
                    fragmentManager.beginTransaction().replace(R.id.container_body, fragmentConfigureEmulatorStepOne).commit();



                }else if (position == 3){

                    FragmentBuildFirstApp fragmentBuildFirstApp = new FragmentBuildFirstApp();
                    fragmentManager.beginTransaction().replace(R.id.container_body, fragmentBuildFirstApp).commit();


                }else if (position == 4){

                }else if (position == 5){

                }else if (position == 6){

                }else if (position == 7){

                }




            }
        });


        return inflaterView ;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
