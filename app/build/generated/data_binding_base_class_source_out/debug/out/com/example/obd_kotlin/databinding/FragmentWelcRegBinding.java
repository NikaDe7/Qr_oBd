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

public final class FragmentWelcRegBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView authLabel;

  @NonNull
  public final Button authLogInButton;

  @NonNull
  public final TextView authPassLabel;

  @NonNull
  public final EditText authPassTextbox;

  @NonNull
  public final EditText authSignInLoginTextbox;

  @NonNull
  public final TextView authSingInEmailLabel;

  @NonNull
  public final EditText authSingInEmailTextbox;

  @NonNull
  public final TextView authSingInLoginLabel;

  private FragmentWelcRegBinding(@NonNull LinearLayout rootView, @NonNull TextView authLabel,
      @NonNull Button authLogInButton, @NonNull TextView authPassLabel,
      @NonNull EditText authPassTextbox, @NonNull EditText authSignInLoginTextbox,
      @NonNull TextView authSingInEmailLabel, @NonNull EditText authSingInEmailTextbox,
      @NonNull TextView authSingInLoginLabel) {
    this.rootView = rootView;
    this.authLabel = authLabel;
    this.authLogInButton = authLogInButton;
    this.authPassLabel = authPassLabel;
    this.authPassTextbox = authPassTextbox;
    this.authSignInLoginTextbox = authSignInLoginTextbox;
    this.authSingInEmailLabel = authSingInEmailLabel;
    this.authSingInEmailTextbox = authSingInEmailTextbox;
    this.authSingInLoginLabel = authSingInLoginLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWelcRegBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWelcRegBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_welc_reg, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWelcRegBinding bind(@NonNull View rootView) {
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

      id = R.id.auth_sign_in_login_textbox;
      EditText authSignInLoginTextbox = ViewBindings.findChildViewById(rootView, id);
      if (authSignInLoginTextbox == null) {
        break missingId;
      }

      id = R.id.auth_sing_in_email_label;
      TextView authSingInEmailLabel = ViewBindings.findChildViewById(rootView, id);
      if (authSingInEmailLabel == null) {
        break missingId;
      }

      id = R.id.auth_sing_in_email_textbox;
      EditText authSingInEmailTextbox = ViewBindings.findChildViewById(rootView, id);
      if (authSingInEmailTextbox == null) {
        break missingId;
      }

      id = R.id.auth_sing_in_login_label;
      TextView authSingInLoginLabel = ViewBindings.findChildViewById(rootView, id);
      if (authSingInLoginLabel == null) {
        break missingId;
      }

      return new FragmentWelcRegBinding((LinearLayout) rootView, authLabel, authLogInButton,
          authPassLabel, authPassTextbox, authSignInLoginTextbox, authSingInEmailLabel,
          authSingInEmailTextbox, authSingInLoginLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
