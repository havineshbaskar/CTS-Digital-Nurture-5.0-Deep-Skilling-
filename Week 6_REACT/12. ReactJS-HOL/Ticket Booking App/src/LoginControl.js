import { useState } from "react";
import GuestGreeting from "./GuestGreeting";
import UserGreeting from "./UserGreeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function LoginControl() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <>
      {isLoggedIn ? <UserGreeting /> : <GuestGreeting />}

      <div style={{ textAlign: "center", marginTop: "15px" }}>
        {isLoggedIn ? (
          <LogoutButton onClick={() => setIsLoggedIn(false)} />
        ) : (
          <LoginButton onClick={() => setIsLoggedIn(true)} />
        )}
      </div>
    </>
  );
}

export default LoginControl;