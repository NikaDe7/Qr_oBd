// Generated by view binder compiler. Do not edit!
package com.example.obd_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.obd_kotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWelcAuthBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView authLabel;

  @NonNull
  public final Button authLogInButton;

  @NonNull
  public final TextView authLoginLabel;

  @NonNull
  public final EditText authLoginTextbox;

  @NonNull
  public final TextView authPassLabel;

  @NonNull
  public final EditText authPassTextbox;

  private FragmentWelcAuthBinding(@NonNull LinearLayout rootView, @NonNull TextView authLabel,
      @NonNull Button authLogInButton, @NonNull TextView authLoginLabel,
      @NonNull EditText authLoginTextbox, @NonNull TextView authPassLabel,
      @NonNull EditText authPassTextbox) {
    this.rootView = rootView;
    this.authLabel = authLabel;
    this.authLogInButton = authLogInButton;
    this.authLoginLabel = authLoginLabel;
    this.authLoginTextbox = authLoginTextbox;
    this.authPassLabel = authPassLabel;
    this.authPassTextbox = authPassTextbox;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWelcAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWelcAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_welc_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWelcAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auth_Label;
      TextView authLabel = ViewBindings.findChildViewById(rootView, id);
      if (authLabel == null) {
        break missingId;
      }

      id = R.id.auth_log_in_button;
      Button authLogInButton = ViewBindings.findChildViewById(rootView, id);
      if (authLogInButton == null) {
        break missingId;
      }

      id = R.id.auth_login_label;
      TextView authLoginLabel = ViewBindings.findChildViewById(rootView, id);
      if (authLoginLabel == null) {
        break missingId;
      }

      id = R.id.auth_login_textbox;
      EditText authLoginTextbox = ViewBindings.findChildViewById(rootView, id);
      if (authLoginTextbox == null) {
        break missingId;
      }

      id = R.id.auth_pass_label;
      TextView authPassLabel = ViewBindings.findChildViewById(rootView, id);
      if (authPassLabel == null) {
        break missingId;
      }

      id = R.id.auth_pass_textbox;
      EditText authPassTextbox = ViewBindings.findChildViewById(rootView, id);
      if (authPassTextbox == null) {
        break missingId;
      }

      return new FragmentWelcAuthBinding((LinearLayout) rootView, authLabel, authLogInButton,
          authLoginLabel, authLoginTextbox, authPassLabel, authPassTextbox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}