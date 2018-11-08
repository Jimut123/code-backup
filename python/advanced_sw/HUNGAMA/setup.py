from setuptools import setup
import os
def read(fname):
    return open(os.path.join(os.path.dirname(__file__), fname)).read()

if __name__ == '__main__':
    setup(
        name = 'hungama',
        version="0.01",
        description = 'A Python based song collecting tool, give it the song id from hungama and ready for download!',
        author = 'Jimut Bahan Pal',
        author_email = 'paljimutbahan@gmail.com',
        maintainer = 'Jimut Bahan Pal',
        maintainer_email = 'paljimutbahan@gmail.com',
        url = '',
        license = 'GPLv2+',
        platforms = 'Linux',
        py_modules = ['hungama'],
        entry_points = {
            'console_scripts': ['hungama = hungama:main'],
        },
        include_package_data = True,
        install_requires = [
            'beautifulsoup4',
            'urllib3',
            'datetime',
            'pip',
            'wget'
        ],
        keywords = 'Hungama song collector, bypassing the robots.txt',
        classifiers = [
                'Development Status :: 4 - Production/Stable',
                'Environment :: Console',
                'Intended Audience :: End Users/Desktop',
                'Intended Audience :: System Administrators',
                'License :: OSI Approved :: GNU General Public License v2 or later (GPLv2+)',
                'Operating System :: Ubuntu',
                'Programming Language :: Python :: 3.5',
                'Topic :: Internet :: WWW/HTTP',
                'Topic :: Internet :: WWW/HTTP :: Indexing/Search'
                ],
    )

