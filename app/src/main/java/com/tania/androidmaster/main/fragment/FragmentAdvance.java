package com.tania.androidmaster.main.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tania.androidmaster.R;
import com.tania.androidmaster.main.adapter.AdvanceListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentAdvance.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentAdvance#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentAdvance extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView advanceTopicList;
    ArrayList<String> arrayList = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    public FragmentAdvance() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentAdvance.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentAdvance newInstance(String param1, String param2) {
        FragmentAdvance fragment = new FragmentAdvance();
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

        View inflaterView = inflater.inflate(R.layout.fragment_advance, container, false);

        advanceTopicList = (ListView) inflaterView.findViewById(R.id.advanceList);

        arrayList.add("How to Debug in Android");
        arrayList.add("How to add Dependency and Permission on your App");
        arrayList.add("What is Version Control System and How it works");
        arrayList.add("What is Firebase and how to use in your App ");
        arrayList.add("What is Local Database and how to use it");
        arrayList.add("How to Connect Your App with Server or Internet");
        arrayList.add("How to use data from server or API and what is JSON parsing");
        arrayList.add("How to send Data from your App to server");
        arrayList.add("How to use webview on your App");
        arrayList.add("Some useful video tutorial");
        arrayList.add("Some Useful Reference Link");


        Log.d("ArrayList ", " ArrayList" + arrayList);

        AdvanceListAdapter advanceListAdapter = new AdvanceListAdapter(getActivity(),arrayList);

        advanceTopicList.setAdapter(advanceListAdapter);

        return inflaterView;
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
