import React from "react";
import "./styles/App.css";
import TurtleManager from "./components/TurtleManager.tsx";
import BaskingIncidentManager from "./components/BaskingIncidentManager.tsx";

function App() {
  return (
    <div className="App">
      <h1>Honu Basking Tracker</h1>
      <TurtleManager />
      <BaskingIncidentManager />
    </div>
  );
}

export default App;
