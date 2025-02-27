import { useState } from "react";

function App() {
    const [message, setMessage] = useState("");

    const fetchMessage = () => {
        fetch("http://localhost:8080/message")
            .then(response => response.text())
            .then(data => setMessage(data))
            .catch(error => setMessage("Error fetching message"));
    };

    return (
        <div style={{ textAlign: "center", marginTop: "50px" }}>
            <button onClick={fetchMessage} style={{ fontSize: "18px", padding: "10px 20px", cursor: "pointer" }}>
                Get Message
            </button>
            <p style={{ fontSize: "20px", marginTop: "20px" }}>{message}</p>
        </div>
    );
}

export default App;
