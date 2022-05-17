import './style.css';
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';

export function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSMovie</h1>
                    <a href="https://github.com/adriel-dev">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <p className='ds-movie-contact-text'>/devsuperior</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}