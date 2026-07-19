import { useNavigate } from "react-router-dom";

const NavbarEmployee = () => {
    //estructure logic;

    const navigate = useNavigate();

    function backHome () {
        navigate('/');
    }


    return (
        //estructure html;
        <div className="container">
            <nav className="nav-bar">
                <h1>
                    <span>👤</span>Sistema de Gestão
                </h1>

                <div className="nav-items">
                    <a className="log-out" onClick={backHome} target='_self'>Sair</a>
                </div>
            </nav>
        </div>
    );
}

export default NavbarEmployee

